package com.sunny.www.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubInsert extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName, editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_insert);

        editTextName=findViewById(R.id.editTextName);
        editTextPhone=findViewById(R.id.editTextPhone);

        Button button=findViewById(R.id.buttonSave);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor=getSharedPreferences("AWEPrefs",Context.MODE_PRIVATE).edit();
        editor.putString("editTextName",editTextName.getText().toString());
        editor.putString("editTextPhone",editTextPhone.getText().toString());
        editor.commit();
        super.finish();
    }
}
