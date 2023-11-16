package com.example.tampilanbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung_trapesium extends AppCompatActivity {
    Button BtnLuas, BtnKeliling, BtnHitung, BtnBack;
    EditText ETatas, ETbawah, ETsisi1, ETsisi2, ETtinggi;
    TextView TVhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_trapesium);
        BtnHitung = findViewById(R.id.Bitung);
        BtnLuas = findViewById(R.id.luas);
        BtnKeliling = findViewById(R.id.keliling);
        ETatas = findViewById(R.id.sisiAtas);
        ETbawah = findViewById(R.id.sisiBawah);
        ETsisi1 = findViewById(R.id.sisimiring1);
        ETsisi2 = findViewById(R.id.sisimiring2);
        ETtinggi = findViewById(R.id.tinggi);
        TVhasil = findViewById(R.id.hasil);
        BtnBack = findViewById(R.id.back);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c, d, e;
                double hitung;

                if (!ETtinggi.getText().toString().isEmpty()) {
                    a = Integer.parseInt(ETatas.getText().toString());
                    b = Integer.parseInt(ETbawah.getText().toString());
                    e = Integer.parseInt(ETtinggi.getText().toString());

                    hitung = (a+b) * e / 2;
                    TVhasil.setText(hitung+"");
                } else {
                    a = Integer.parseInt(ETatas.getText().toString());
                    b = Integer.parseInt(ETbawah.getText().toString());
                    c = Integer.parseInt(ETsisi1.getText().toString());
                    d = Integer.parseInt(ETsisi2.getText().toString());

                    hitung = a + b + c + d;
                    TVhasil.setText(hitung+"");
                }

            }
        });

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETatas.setText("");
                ETbawah.setText("");
                ETsisi1.setText("");
                ETsisi2.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");

                ETatas.setVisibility(view.VISIBLE);
                ETbawah.setVisibility(view.VISIBLE);
                ETsisi1.setVisibility(view.GONE);
                ETsisi2.setVisibility(view.GONE);
                ETtinggi.setVisibility(view.VISIBLE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETatas.setText("");
                ETbawah.setText("");
                ETsisi1.setText("");
                ETsisi2.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");

                ETatas.setVisibility(view.VISIBLE);
                ETbawah.setVisibility(view.VISIBLE);
                ETsisi1.setVisibility(view.VISIBLE);
                ETsisi2.setVisibility(view.VISIBLE);
                ETtinggi.setVisibility(view.GONE);
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitung_trapesium.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }

}