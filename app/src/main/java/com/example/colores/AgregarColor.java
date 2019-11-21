package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AgregarColor extends AppCompatActivity {

    EditText c ;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_color);

        c = (EditText) findViewById(R.id.editText);
        t = (TextView) findViewById(R.id.textoss);
    }

    public void botonRegresar(View v)
    {
        Intent pantallaAgregarColor = new Intent(this,MainActivity.class);
        startActivity(pantallaAgregarColor);
        finish();
    }

    public void boton2(View v)
    {
        Intent pantallaMostrarColor = new Intent(this,MostrarColor.class);
        startActivity(pantallaMostrarColor);
        finish();
    }

    public static ArrayList<String> colores = new ArrayList<String>();

    public static void insertar(String color)
    {
        colores.add(color);
    }

    public static ArrayList<String> mostrar()
    {
        return colores;
    }

    public void agregarColor(View v)
    {
        if(c.getText().toString().length() < 1)
        {
            t.setText("Error Campo vacio");
        }
        else
            {
            insertar(c.getText().toString());
            t.setText(null);
            c.setText(null);
        }
    }
}