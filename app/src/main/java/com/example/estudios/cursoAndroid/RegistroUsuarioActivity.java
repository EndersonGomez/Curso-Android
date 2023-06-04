package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.PatternsCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.estudios.databinding.ActivityRegistroUsuarioBinding;


public class RegistroUsuarioActivity extends AppCompatActivity {

    //Creamos los atributos.
    private ActivityRegistroUsuarioBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Luego le damos el valor  y enlazamos la parte visual a nuestro codigo.
        mBinding = ActivityRegistroUsuarioBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Creamos el evento listener para ejecutar y enviar los datos a la segunda activity
        mBinding.registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Creamos las variables para obtener los datos ingresados del usuario.
                String nombreString = mBinding.nombre.getText().toString();
                String apellidoString = mBinding.apellido.getText().toString();
                String correoString = mBinding.correo.getText().toString();
                String contraseñaString = mBinding.contrasenia.getText().toString();

                //Si no se cumplen los parametros establecidos enviara mensajes de error diferentes por cada campo.
                if (nombreString.isEmpty() || !nombreString.matches("^[a-zA-Z]+$")){
                    Toast.makeText(RegistroUsuarioActivity.this, "El nombre solo puede llevar letras y " +
                            " no puede estar el campo vacio", Toast.LENGTH_LONG).show();
                }
                else if (apellidoString.isEmpty() || !apellidoString.matches("^[a-zA-Z]+$")){
                    Toast.makeText(RegistroUsuarioActivity.this, "El apellido solo puede llevar letras y" +
                            " no puede estar el campo vacio", Toast.LENGTH_LONG).show();
                }
                else if (!PatternsCompat.EMAIL_ADDRESS.matcher(correoString).matches()){
                    Toast.makeText(RegistroUsuarioActivity.this, "El correo debe tener el formato correcto",
                            Toast.LENGTH_LONG).show();
                }
                else if (contraseñaString.length() <= 8){
                    Toast.makeText(RegistroUsuarioActivity.this, "La contraseña debe tener al menos 8 letras o numeros", Toast.LENGTH_LONG).show();
                }else {
                    pasarDatos(nombreString,apellidoString,correoString,contraseñaString);
                }


            }
        });

    }

    //Creamos la funcion que envia los datos a la otra activity
    private void pasarDatos (String nombre, String apellido, String correo, String contrasenia){

        //Creamos una de intent y le pasamos sus parametros.
        Intent intent = new Intent(RegistroUsuarioActivity.this, Main2Activity.class);
        intent.putExtra("name",nombre);
        intent.putExtra("lastName", apellido);
        intent.putExtra("email", correo);
        intent.putExtra("password", contrasenia);

        //Este comando ejecuta el envio de los datos.
        startActivity(intent);
    }
}