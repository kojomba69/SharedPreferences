package com.sunny.www.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.ButtonInsert);
        button1.setOnClickListener(this);
        Button button2=findViewById(R.id.buttonResult);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        Intent intent=null;
        switch (id){
            case R.id.ButtonInsert:
                intent =new Intent(this, SubInsert.class);

                break;
            case R.id.buttonResult:
                intent =new Intent(this, SubResult.class);

                break;

        }
        startActivityForResult(intent, 100);


    }
}
