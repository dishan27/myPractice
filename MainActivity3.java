package com.app.mypractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

     private Spinner spinner;
     private Spinner spinner2;
     private Spinner spinner3;

     String s[] = {"A","B","C","D"};
    String s1[] = {"A1","B1","C1","D1"};
    String s2[] = {"A2","B2","C2","D2"};

    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);

        adapter = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_spinner_dropdown_item, s);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        adapter1 = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_spinner_dropdown_item, s1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);

        adapter2 = new ArrayAdapter<String>(MainActivity3.this, android.R.layout.simple_spinner_dropdown_item, s2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);

    }
}