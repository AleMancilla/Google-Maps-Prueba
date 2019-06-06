package com.example.googlemapprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_tipos,button_ubicacion,button_sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_sitios = findViewById(R.id.button_sitios_turisticos);
        button_tipos = findViewById(R.id.button_tipos_mapas);
        button_ubicacion = findViewById(R.id.button_mi_ubicacion);
    }

    public void button_sitios_turisticos(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MapsActivity1.class);
        startActivity(intent);
    }
}
