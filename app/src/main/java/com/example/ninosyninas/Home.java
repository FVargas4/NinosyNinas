package com.example.ninosyninas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton noticia;
    ImageButton galeria;
    ImageButton menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        galeria = findViewById(R.id.botonGaleria);
        noticia = findViewById(R.id.botonNoticias);
        menu = findViewById(R.id.botonMenu);

        galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, LoginScreen.class));
            }
        });
    }
}