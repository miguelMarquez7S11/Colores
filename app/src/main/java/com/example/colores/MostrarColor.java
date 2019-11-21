package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MostrarColor extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner campo;
    ArrayAdapter<String> colores;
    boolean desicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_color);

        campo = findViewById(R.id.spinner2);
        colores = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, AgregarColor.mostrar());
        campo.setAdapter(colores);
        campo.setOnItemSelectedListener(this);
    }

    public void botonRegresar(View v)
    {
        Intent pantallaAgregarColor = new Intent(this,MainActivity.class);
        startActivity(pantallaAgregarColor);
        finish();
    }

    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id)
    {
        if(!desicion)
        {
            desicion = true;
            return;
        }
        Toast.makeText(this, "Selecciono el Color: " + parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();
    }

    public void onNothingSelected(AdapterView<?> arg0)
    {

    }
}
