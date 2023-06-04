package com.example.estudios.cursoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.estudios.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.d("Ciclo de Vida", "onCreate: ");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de Vida", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de Vida", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de Vida", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de Vida", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo de Vida", "onDestroy: ");
    }
}