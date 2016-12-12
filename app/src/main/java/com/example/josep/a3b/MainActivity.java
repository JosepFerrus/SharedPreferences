package com.example.josep.a3b;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MainActivity extends AppCompatActivity {
    public static final String PREFS = "My preferences";
    EditText nombre, dni, fecha;
    RadioButton sexo,sexo2;
    Button guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombre2);
        dni = (EditText)findViewById(R.id.dni);
        fecha = (EditText)findViewById(R.id.editText3);
        sexo= (RadioButton) findViewById(R.id.radioButton);
        sexo2= (RadioButton) findViewById(R.id.radioButton2);
        guardar = (Button)findViewById(R.id.guardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                SharedPreferences mySharedPreferences = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = mySharedPreferences.edit();


                editor.putString("Nombre", nombre.getText().toString());
                editor.putString("DNI", dni.getText().toString());
                editor.putString("Fecha", fecha.getText().toString());
                if(sexo.isChecked()){
                    editor.putString("Genero", sexo.getText().toString());
                }else{
                    editor.putString("Genero", sexo2.getText().toString());
                }
                editor.commit();

                startActivity(i);
            }
        });


    }
}
