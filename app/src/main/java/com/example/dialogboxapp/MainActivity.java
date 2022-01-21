package com.example.dialogboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnEnter;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listV  = findViewById(R.id.listView1);
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Khan");
        ArrayAdapter<String> arrAd = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        listV.setAdapter(arrAd);
         btnEnter = findViewById(R.id.btnAdd);
         edt = findViewById(R.id.editTxtName);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String name = edt.getText().toString();
                names.add(name);
            }
        });
    }

}