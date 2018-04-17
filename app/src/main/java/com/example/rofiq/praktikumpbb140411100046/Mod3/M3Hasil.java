package com.example.rofiq.praktikumpbb140411100046.Mod3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rofiq.praktikumpbb140411100046.R;

public class M3Hasil extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4, textView5, textView6;
    String name, reg, dept, kotaLahir, hobi, tanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3_hasil);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);

        Intent intent = getIntent();

        name = intent.getStringExtra("name_key");
        reg = intent.getStringExtra("reg_key");
        dept = intent.getStringExtra("dept_key");
        kotaLahir = intent.getStringExtra("kotaLahir_key");
        hobi = intent.getStringExtra("hobi_key");
        tanggalLahir = intent.getStringExtra("tanggalLahir_key");

        textView1.setText(name);
        textView2.setText(reg);
        textView3.setText(dept);
        textView4.setText(kotaLahir);
        textView5.setText(hobi);
        textView6.setText(tanggalLahir);
    }
}