package com.example.rofiq.praktikumpbb140411100046.Mod2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rofiq.praktikumpbb140411100046.R;

public class M2Hasil extends AppCompatActivity {

    int ch = 1, ubahKalimat = 1;
    float font = 30;
    private Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_hasil);

        final TextView textView = (TextView)findViewById(R.id.textView);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextSize(font);
                font = font+5;
                if (font==45)
                    font=25;
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1:
                        textView.setTextColor(Color.RED);
                        break;
                    case 2:
                        textView.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        textView.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        textView.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        textView.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        textView.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch==7)
                    ch=1;
            }
        });

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ubahKalimat){
                    case 1:
                        textView.setText("Senin");
                        break;
                    case 2:
                        textView.setText("Selasa");
                        break;
                    case 3:
                        textView.setText("Rabu");
                        break;
                    case 4:
                        textView.setText("Kamis");
                        break;
                    case 5:
                        textView.setText("Jum'at");
                        break;
                    case 6:
                        textView.setText("Sabtu");
                        break;
                    case 7:
                        textView.setText("Minggu");
                        break;
                    case 8:
                        textView.setText("140411100046");
                        break;
                }
                ubahKalimat++;
                if (ubahKalimat==9)
                    ubahKalimat=1;
            }
        });

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M2Hasil.this, ContohXML.class);
                startActivity(intent);
            }
        });
    }
}