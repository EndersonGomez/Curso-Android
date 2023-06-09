package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.estudios.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Creamos el atributo viewBiding que solitica el ejercicio 10 .
    private ActivityMainBinding Biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Luego le damos el valor solicitado en el ejercicio 10.
        Biding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(Biding.getRoot());

        //Creamos el mensaje de bienvenida.
        Toast.makeText(MainActivity.this, "BIENVENIDO", Toast.LENGTH_LONG).show();

        //Creamos el evento escuchador que cierra la aplicacion.
        Biding.cerrarApliacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //Creamos el evento escuchador para llevarnos a la activity de los botones.
       Biding.botones.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent1 = new Intent(MainActivity.this, Main5Activity.class);
               startActivity(intent1);
           }
       });

       //Creamos el evento escuchador que nos lleva a la siguiente actividad.
        Biding.ingresarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}