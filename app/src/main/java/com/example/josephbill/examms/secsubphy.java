package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubphy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubphy);
    }
    public void phy1 (View v){
        Intent intent = new Intent(this,secsubphy1.class);
        startActivity(intent);
    }
    public void phy2 (View v){
        Intent intent = new Intent(this,secsubphy2.class);
        startActivity(intent);
    }
}
