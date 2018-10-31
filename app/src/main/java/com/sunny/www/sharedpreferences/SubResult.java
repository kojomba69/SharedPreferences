package com.sunny.www.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SubResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_result);

        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);

        SharedPreferences sharedPreferences=getSharedPreferences("AWEPrefs",Context.MODE_PRIVATE);
        String nameKey=sharedPreferences.getString("editTextName",null);
        String phoneKey=sharedPreferences.getString("editTextPhone",null);

        textView5.setText("NAME"+nameKey);
        textView6.setText("PHONE"+phoneKey);

    }
}
