package com.example.appbibliotecaescolar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //metodo para el boton ingresar
    public void Ingresar(View view){
        Intent  ingreso = new Intent(this, Ingreso.class);
        startActivity(ingreso);
    }
     //metodo para el boton registrase
    public void Registrarse(View view){
        Intent registrarse = new Intent(this, Registrarse.class);
        startActivity(registrarse);
    }

}