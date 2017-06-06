package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubcomps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubcomps);
    }

    public void comp1 (View v){
        Intent intent = new Intent(this,secsubcomps1.class);
        startActivity(intent);
    }
    public void comp2 (View v){
        Intent intent = new Intent(this,secsubcomps2.class);
        startActivity(intent);
    }
}
