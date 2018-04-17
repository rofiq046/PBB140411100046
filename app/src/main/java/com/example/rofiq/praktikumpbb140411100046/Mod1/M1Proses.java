package com.example.rofiq.praktikumpbb140411100046.Mod1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rofiq.praktikumpbb140411100046.R;

public class M1Proses extends AppCompatActivity {

    private Button buttonProses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_proses);

        buttonProses = (Button)findViewById(R.id.buttonProses1);
        buttonProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M1Proses.this, M1Hasil.class);
                Toast.makeText(M1Proses.this, "Hallo Ainur Rofiq, Nim 140411100046", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
