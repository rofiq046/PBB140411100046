package com.example.rofiq.praktikumpbb140411100046.Mod4;

import android.app.ListActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import com.example.rofiq.praktikumpbb140411100046.R;

public class M4Hasil extends ListActivity {

    Cursor cursor;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4_hasil);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
                startManagingCursor(cursor);
                String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER,
                        ContactsContract.CommonDataKinds.Phone._ID};
                int[] to = {android.R.id.text1, android.R.id.text2};
                SimpleCursorAdapter listadapter = new SimpleCursorAdapter(M4Hasil.this, android.R.layout.simple_list_item_2, cursor, from, to);
                setListAdapter(listadapter);
//
//                listView = getListView();
//                listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
            }
        });
    }
}
