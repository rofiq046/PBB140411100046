package com.example.rofiq.praktikumpbb140411100046.Mod3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.rofiq.praktikumpbb140411100046.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class M3Proses extends AppCompatActivity {

    private EditText editText1, editText2, editText5, date;
    private Button button;
    private Spinner spinnerDept, spinnerKotaLahir;
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;

    String [] dept_array = {"Teknik Informatika", "Teknik Industri", "Teknik Elektro", "Teknik Mesin"};
    String [] kotaLahir_array = {"Bojonegoro","Lamongan","Tuban","Gersik","Surabaya"};

    String name, reg, dept, kotaLahir, hobi, tanggalLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3_proses);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText5 = (EditText)findViewById(R.id.editText5);

        date = (EditText)findViewById(R.id.date);

        spinnerDept = (Spinner)findViewById(R.id.spinner);
        spinnerKotaLahir = (Spinner)findViewById(R.id.spinner1);

        button = (Button)findViewById(R.id.button);

        ArrayAdapter adapterDept = new ArrayAdapter(M3Proses.this, android.R.layout.simple_spinner_item, dept_array);
        spinnerDept.setAdapter(adapterDept);

        ArrayAdapter adapterKotaLahir = new ArrayAdapter(M3Proses.this, android.R.layout.simple_spinner_item, kotaLahir_array);
        spinnerKotaLahir.setAdapter(adapterKotaLahir);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText1.getText().toString();
                reg = editText2.getText().toString();
                dept = spinnerDept.getSelectedItem().toString();
                kotaLahir = spinnerKotaLahir.getSelectedItem().toString();
                hobi = editText5.getText().toString();
                tanggalLahir = date.getText().toString();

                Intent intent = new Intent(M3Proses.this, M3Hasil.class);
                intent.putExtra("name_key", name);
                intent.putExtra("reg_key", reg);
                intent.putExtra("dept_key", dept);
                intent.putExtra("kotaLahir_key", kotaLahir);
                intent.putExtra("hobi_key", hobi);
                intent.putExtra("tanggalLahir_key", tanggalLahir);

                startActivity(intent);
            }
        });

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        date = (EditText)findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });

    }

    private void showDateDialog() {
        Calendar calendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(M3Proses.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, dayOfMonth);

                date.setText(dateFormatter.format(newDate.getTime()));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
