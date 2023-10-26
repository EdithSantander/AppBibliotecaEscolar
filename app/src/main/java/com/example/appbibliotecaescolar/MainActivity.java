package com.example.appbibliotecaescolar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private void setActionBar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint("WrongViewCast") Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    //metodo para el boton ingresar
    public void Ingresar(View view){
        Intent  ingreso = new Intent(this, Ingreso.class);
        startActivity(ingreso);
    }
     //metodo para el boton registrase
    public void Registrarse(View view){
        Intent registrarse = new Intent(this, Registrarse.class);
    }

}