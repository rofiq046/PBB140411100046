package com.example.rofiq.praktikumpbb140411100046.ACC;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rofiq.praktikumpbb140411100046.R;

public class Kalkulator extends AppCompatActivity {

    public String masuk, obiner, ooctal, ohexa;
    int a, num;
    public String str = "";
    EditText dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        dob = (EditText)findViewById(R.id.input);
        final TextView biner = (TextView)findViewById(R.id.biner);
        final TextView octal = (TextView)findViewById(R.id.octal);
        final TextView hexa = (TextView)findViewById(R.id.hexa);
        Button convert = (Button)findViewById(R.id.convert);
        Button reset = (Button)findViewById(R.id.reset);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masuk = dob.getText().toString();
                a = Integer.parseInt(masuk);
                obiner = Integer.toBinaryString(a);
                ohexa = Integer.toHexString(a);
                ooctal = Integer.toOctalString(a);

                biner.setText("Biner\t\t\t\t\t\t\t: "+ obiner);
                octal.setText("Octal\t\t\t\t\t\t\t: "+ ooctal);
                hexa.setText("Hexa\t\t\t\t\t\t\t\t: "+ ohexa);
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dob.setText("0");
                biner.setText("Biner\t\t\t\t\t\t\t: ");
                octal.setText("Octal\t\t\t\t\t\t\t: ");
                hexa.setText("Hexa\t\t\t\t\t\t\t\t: ");
            }
        });
    }

    public void btn1Clicked(View v){
        insert(1);
    }

    private void insert(int j){
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        dob.setText(str);
    }
}
