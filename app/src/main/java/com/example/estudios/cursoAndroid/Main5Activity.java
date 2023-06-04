package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.estudios.databinding.ActivityMain5Binding;

public class Main5Activity extends AppCompatActivity {

    //Creamos el atributo del tipo viewBiding
    private ActivityMain5Binding Biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos valor al atributo y luego enlazamos el diseño con nuestro codigo.
        Biding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(Biding.getRoot());

        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Turn off flight mode", Toast.LENGTH_LONG).show();
            }
        });

        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Updating profile", Toast.LENGTH_LONG).show();
            }
        });

        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Picture saved to gallery", Toast.LENGTH_SHORT).show();
            }
        });

        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Unlocked level 5", Toast.LENGTH_SHORT).show();
            }
        });


        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Level 4 completed", Toast.LENGTH_SHORT).show();
            }
        });

        //Creamos el evento escuchadro para mostrar mensaje toast cuando se seleccione.
        Biding.boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this, "Music Paused", Toast.LENGTH_SHORT).show();
            }
        });
    }
}