package com.example.blindspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        menu = findViewById(R.id.btnhomee6);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(profile.this, Menu.class);
                startActivity(intent);
            }
        });


        personas = findViewById(R.id.btnpersona6);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(profile.this, personas.class);
                startActivity(intent);
            }
        });


        casos = findViewById(R.id.btnperfil6);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(profile.this, aventura.class);
                startActivity(intent);
            }
        });
    }
}
