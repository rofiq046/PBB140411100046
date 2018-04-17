package com.example.rofiq.praktikumpbb140411100046.Mod2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;

import com.example.rofiq.praktikumpbb140411100046.Mod3.M3Proses;
import com.example.rofiq.praktikumpbb140411100046.R;

import java.util.ArrayList;
import java.util.Collection;

public class ContohXML extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;

    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    String [] namaHewan = {"Kucing", "Ayam", "Kelinci", "Semut", "Gajah", "Tikus", "Harimau",
    "Katak", "Kambing", "Sapi", "Bungklon", "Singa", "Unta", "Monyet", "Kadal", "Luwak",
    "Tokek", "Cicak", "Lumba-lumba"};

    String [] namaHari = {"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"};

    String[] heroML = {"Hylos", "Akai", "Balmon"};
    ListView listView;

    ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_xml);
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoComplete);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView)findViewById(R.id.multiAuto);

        ArrayAdapter adapterHari = new ArrayAdapter(ContohXML.this, android.R.layout.simple_list_item_1, namaHari);
        autoCompleteTextView.setAdapter(adapterHari);
        autoCompleteTextView.setThreshold(1);

        ArrayAdapter adapterHewan = new ArrayAdapter(ContohXML.this, android.R.layout.simple_list_item_1, namaHewan);
        multiAutoCompleteTextView.setAdapter(adapterHewan);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        listView =(ListView)findViewById(R.id.listView);
        ArrayAdapter adapterList = new ArrayAdapter(ContohXML.this, android.R.layout.simple_list_item_1, heroML);
        listView.setAdapter(adapterList);
    }
}