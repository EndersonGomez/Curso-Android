package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.estudios.R;
import com.example.estudios.databinding.ActivityMain3Binding;

public class Main3Activity extends AppCompatActivity {

    //Declaramos los atributos a usar en la clase.
    private ActivityMain3Binding binding;
    private int imagenSeleccionadaId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos el valor al atributo viewBigind y enlazamos la parte visual a nuestro codigo.
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*Creamos un evento escuchador y de ejecutarse escoge de la carpeta drawable el
        recurso seleccionado y lo guarda en una variable para poder enviarse a la siguiente activity.
         */
        binding.logoV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagenSeleccionada(R.drawable.imagen_logov1);
            }
        });

        /*Creamos un evento escuchador y de ejecutarse escoge de la carpeta drawable el
        recurso seleccionado y lo guarda en una variable para poder enviarse a la siguiente activity.
         */
        binding.logoV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagenSeleccionada(R.drawable.imagen_logov2);
            }
        });

        /*Creamos un evento escuchador y de ejecutarse escoge de la carpeta drawable el
        recurso seleccionado y lo guarda en una variable para poder enviarse a la siguiente activity.
         */
        binding.logoV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagenSeleccionada(R.drawable.imagen_logov3);
            }
        });

        /*Creamos un evento escuchador y de ejecutarse escoge de la carpeta drawable el
        recurso seleccionado y lo guarda en una variable para poder enviarse a la siguiente activity.
         */
        binding.logoV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagenSeleccionada(R.drawable.imagen_logov4);
            }
        });

        //Creamos el evento escuchador del boton para llamar a la funcion enviar imagen.
        binding.botonConfirmacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarImagen(imagenSeleccionadaId);
            }
        });
    }

    //La funcion toma la imagen seleccionada y la guarda en una variable para ser usada.
    private void imagenSeleccionada(int imagenId) {
        imagenSeleccionadaId = imagenId;
    }

    //La funcion crea un intent para pasar la imagen escogida a la siguiente actividad.
    private void enviarImagen(int imagen) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        intent.putExtra("Imagen", imagenSeleccionadaId);
        startActivity(intent);
    }
}
