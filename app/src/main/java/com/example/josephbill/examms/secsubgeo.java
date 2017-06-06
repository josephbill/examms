package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubgeo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubgeo);
    }
    public void geo1 (View v){
        Intent intent = new Intent(this,secsubgeo1.class);
        startActivity(intent);
    }
    public void geo2 (View v){
        Intent intent = new Intent(this,secsubgeo2.class);
        startActivity(intent);
    }
}
