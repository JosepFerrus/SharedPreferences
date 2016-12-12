package com.example.josep.a3b;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import static com.example.josep.a3b.MainActivity.PREFS;

public class Main2Activity extends AppCompatActivity {

    TextView nombre, fecha, dni, genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombre=(TextView)findViewById(R.id.nom);
        fecha=(TextView)findViewById(R.id.data);
        dni=(TextView)findViewById(R.id.dni2);
        genero=(TextView)findViewById(R.id.genero);


        SharedPreferences mySharedPreferences = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
        String Nombres = mySharedPreferences.getString("Nombre","");
        String DNIS = mySharedPreferences.getString("DNI","");
        String edads = mySharedPreferences.getString("Fecha","");
        String Genero = mySharedPreferences.getString("Genero","");
        nombre.setText(Nombres);
        fecha.setText(edads);
        dni.setText(DNIS);
        genero.setText(Genero);


    }

}
