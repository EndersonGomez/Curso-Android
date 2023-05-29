package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.estudios.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

    //Se crea el atributo del tipo databiding.
    private ActivityMain2Binding main2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos el valor y luego enlazamos el layout a nuestro codigo.
        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(main2Binding.getRoot());

        //Intanciamos una un objeto de la clase intent para recibir los datos del otro intent.
        Intent intent = getIntent();

        //Vericamos que el intent no este vacio y seteamos los valores de los campos con los datos recibidos de la otra activity.
        if (intent != null){
            main2Binding.nombreRecibido.setText(intent.getStringExtra("name"));
            main2Binding.apellidoRecibido.setText(intent.getStringExtra("lastName"));
            main2Binding.correoRecibido.setText(intent.getStringExtra("email"));
            main2Binding.contraseniaRecibida.setText(intent.getStringExtra("password"));
        }
    }
}