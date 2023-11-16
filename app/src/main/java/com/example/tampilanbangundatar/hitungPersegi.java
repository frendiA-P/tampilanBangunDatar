package com.example.tampilanbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitungPersegi extends AppCompatActivity {
    Button BtnLuas, BtnKeliling, BtnBack;
    EditText ETpanjang, ETlebar;
    TextView TVhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);
        ETpanjang = findViewById(R.id.panjang);
        ETlebar = findViewById(R.id.lebar);
        BtnLuas = findViewById(R.id.luas);
        BtnKeliling = findViewById(R.id.keliling);
        TVhasil = findViewById(R.id.hasil);
        BtnBack = findViewById(R.id.back);

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputpanjang = ETpanjang.getText().toString().trim();
                String inputlebar = ETlebar.getText().toString().trim();

                int hitungluas = Integer.parseInt(inputpanjang) * Integer.parseInt(inputlebar);
                TVhasil.setText("Luas = " + String.valueOf(hitungluas));
            }
        });
        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputpnjng = ETpanjang.getText().toString().trim();
                String inputlbr = ETlebar.getText().toString().trim();

                int hitungkeliling = Integer.parseInt(inputpnjng) + Integer.parseInt(inputlbr) + Integer.parseInt(inputpnjng) + Integer.parseInt(inputlbr);
                TVhasil.setText("Keliling = " +String.valueOf(hitungkeliling));
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitungPersegi.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }
}