package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.estudios.R;
import com.example.estudios.databinding.ActivityMain4Binding;

public class Main4Activity extends AppCompatActivity {

    //Declaramos el atributo del tipo viewBidgin;
    private ActivityMain4Binding Biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos el valor al atributo viewBigind y enlazamos la parte visual a nuestro codigo.
        Biding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(Biding.getRoot());

        //Creamos el evento escuchador para poder cerrar la aplicacion con el boton.
        Biding.botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        //Instanciamos el intent para recibir el intent enviado de la clase anterior
        Intent intent1 = getIntent();

        //Verificamos primero que el intent no sea nulo luego seteamos el valor de imagen.
        if (intent1 != null){
            Biding.imagenRecibida.setImageResource(intent1.getIntExtra("Imagen", R.drawable.imagen_logov1 ));
        }

        //Creamos el evento escuchador que nos regresara a la actividad anterior.
        Biding.botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}