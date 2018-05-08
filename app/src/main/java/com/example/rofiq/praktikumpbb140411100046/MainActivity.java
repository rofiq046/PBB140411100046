package com.example.rofiq.praktikumpbb140411100046;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rofiq.praktikumpbb140411100046.ACC.Kalkulator;
import com.example.rofiq.praktikumpbb140411100046.Mod1.M1Proses;
import com.example.rofiq.praktikumpbb140411100046.Mod2.M2Hasil;
import com.example.rofiq.praktikumpbb140411100046.Mod3.M3Proses;
import com.example.rofiq.praktikumpbb140411100046.Mod4.M4Hasil;
import com.example.rofiq.praktikumpbb140411100046.Mod5.M5Activity;
import com.example.rofiq.praktikumpbb140411100046.Mod6.M6Activity;

public class MainActivity extends AppCompatActivity {

    private Button buttonMod1, buttonMod2, buttonMod3, buttonMod4, buttonMod5, buttonMod6, buttonMod7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMod1 = (Button)findViewById(R.id.button1);
        buttonMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M1Proses.class);
                startActivity(intent);
            }
        });

        buttonMod2 = (Button)findViewById(R.id.button2);
        buttonMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M2Hasil.class);
                startActivity(intent);
            }
        });

        buttonMod3 = (Button)findViewById(R.id.button3);
        buttonMod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M3Proses.class);
                startActivity(intent);
            }
        });

        buttonMod4 = (Button)findViewById(R.id.button4);
        buttonMod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M4Hasil.class);
                startActivity(intent);
            }
        });

        buttonMod5 = (Button)findViewById(R.id.button5);
        buttonMod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M5Activity.class);
                startActivity(intent);
            }
        });

        buttonMod6 = (Button)findViewById(R.id.button6);
        buttonMod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, M6Activity.class);
                startActivity(intent);
            }
        });

        buttonMod7 = (Button)findViewById(R.id.button7);
        buttonMod7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(intent);
            }
        });
    }
}