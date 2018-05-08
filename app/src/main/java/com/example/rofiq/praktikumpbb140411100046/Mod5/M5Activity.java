package com.example.rofiq.praktikumpbb140411100046.Mod5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rofiq.praktikumpbb140411100046.R;

public class M5Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5);
    }

    public void onButtonClick ( View v ) {
        FragmentM5Two fragmentM5Two = (FragmentM5Two) getSupportFragmentManager().findFragmentById(R.id.fragment_two);

        switch (v.getId()) {
            case R.id.btn_one_create_new:
                if (fragmentM5Two == null) {

                    Intent i = new Intent(this, DrwingM5Activity.class);
                    startActivity(i);
                } else {

                    Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_one_open_existing:
                Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}
