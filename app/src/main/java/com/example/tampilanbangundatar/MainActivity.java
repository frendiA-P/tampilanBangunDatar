package com.example.tampilanbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPersegi = findViewById(R.id.persegi);
        Button btnSegitiga = findViewById(R.id.segitiga);
        Button btnJajarGenjang = findViewById(R.id.jajarGenjang);
        Button btnTrapesium = findViewById(R.id.trapesium);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitungPersegi.class);
                startActivity(explicit);
            }
        });
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitung_segitiga.class);
                startActivity(explicit);
            }
        });
        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitung_jajargenjang.class);
                startActivity(explicit);
            }
        });
        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitung_trapesium.class);
                startActivity(explicit);
            }
        });
    }
}