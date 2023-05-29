package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

                pasarDatos(nombreString,apellidoString,correoString,contraseñaString);
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