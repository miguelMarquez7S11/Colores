package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boton1(View v)
    {
        Intent pantallaAgregarColor = new Intent(this,AgregarColor.class);
        startActivity(pantallaAgregarColor);
        finish();
    }

    public void boton2(View v)
    {
        Intent pantallaMostrarColor = new Intent(this,MostrarColor.class);
        startActivity(pantallaMostrarColor);
        finish();
    }

}
