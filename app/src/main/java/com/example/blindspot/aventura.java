package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aventura extends AppCompatActivity {
  Button menu;
  Button personas;
  Button casos;
  Button perfil;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_aventura);


    menu = findViewById(R.id.btnhomee4);
    menu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, Menu.class);
        startActivity(intent);
      }
    });


    personas = findViewById(R.id.btnpersona4);
    personas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, personas.class);
        startActivity(intent);
      }
    });


    perfil = findViewById(R.id.btnperfil4);
    perfil.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, perfil.class);
        startActivity(intent);
      }
    });
  }

}