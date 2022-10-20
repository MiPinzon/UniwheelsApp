package com.uniwheelsapp.uniwheelsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeDriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_driver);
    }

    private String nombre;
    private String dia;
    private String tipoVehiculo;

    public HomeDriverActivity(){

    }
    public HomeDriverActivity(String n, String d, String t) {
        this.nombre = n;
        this.dia = d;
        this.tipoVehiculo = t;
    }
    public void irAInsertRequested(View view){
        Intent i = new Intent(this,InsertDriverAvailabilityActivity.class);
        startActivity(i);
    }

}