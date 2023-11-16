package com.example.tampilanbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung_segitiga extends AppCompatActivity {

    Button BtnKeliling, BtnLuas, BtnHitung, BtnBack;
    TextView TVhasil;
    EditText ETtinggi, ETsisiA, ETsisiB, ETsisiC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);

        ETtinggi = findViewById(R.id.tinggi);
        ETsisiA = findViewById(R.id.sisiA);
        ETsisiB = findViewById(R.id.sisiB);
        ETsisiC = findViewById(R.id.sisiC);
        TVhasil = findViewById(R.id.hasil);
        BtnHitung = findViewById(R.id.hitung);
        BtnLuas = findViewById(R.id.luas);
        BtnKeliling = findViewById(R.id.keliling);
        BtnBack = findViewById(R.id.back);


        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c, d;
                double hitung;

                if (!ETtinggi.getText().toString().isEmpty()){
                    a = Integer.parseInt(ETsisiA.getText().toString());
                    d = Integer.parseInt(ETtinggi.getText().toString());
                    hitung = 0.5 * a * d;
                    TVhasil.setText(hitung+"");

                } else {
                    a = Integer.parseInt(ETsisiA.getText().toString());
                    b = Integer.parseInt(ETsisiB.getText().toString());
                    c = Integer.parseInt(ETsisiC.getText().toString());
                    hitung = a + b + c;
                TVhasil.setText(hitung+"");
                }
            }
        });

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETsisiB.setText("");
                ETsisiC.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.VISIBLE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.GONE);
                ETsisiC.setVisibility(view.GONE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETtinggi.setText("");
                ETsisiA.setText("");
                ETtinggi.setVisibility(view.GONE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.VISIBLE);
                ETsisiC.setVisibility(view.VISIBLE);
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitung_segitiga.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }
}