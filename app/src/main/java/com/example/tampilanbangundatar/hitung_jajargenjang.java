package com.example.tampilanbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung_jajargenjang extends AppCompatActivity {

    Button BtnLuas, BtnKeliling, BtnHitung, BtnBack;
    EditText ETalas, ETmiring, ETtinggi;
    TextView TVhasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_jajargenjang);

        BtnLuas = findViewById(R.id.luas);
        BtnKeliling = findViewById(R.id.keliling);
        BtnHitung = findViewById(R.id.Bitung);
        ETalas  = findViewById(R.id.Salas);
        ETmiring = findViewById(R.id.Smiring);
        ETtinggi = findViewById(R.id.tinggi);
        TVhasil = findViewById(R.id.hasil);
        BtnBack = findViewById(R.id.back);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c;
                double hitung;

                if (!ETtinggi.getText().toString().isEmpty()){
                    a = Integer.parseInt(ETalas.getText().toString());
                    c = Integer.parseInt(ETtinggi.getText().toString());

                    hitung = a * c;
                    TVhasil.setText(hitung+"");
                } else {
                    a = Integer.parseInt(ETalas.getText().toString());
                    b = Integer.parseInt(ETmiring.getText().toString());

                    hitung = a + a + b + b;
                    TVhasil.setText(hitung+"");
                }
            }
        });

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETalas.setText("");
                ETmiring.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");

                ETalas.setVisibility(view.VISIBLE);
                ETmiring.setVisibility(view.GONE);
                ETtinggi.setVisibility(View.VISIBLE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETalas.setText("");
                ETmiring.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");

                ETalas.setVisibility(view.VISIBLE);
                ETmiring.setVisibility(view.VISIBLE);
                ETtinggi.setVisibility(view.GONE);
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitung_jajargenjang.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }
}