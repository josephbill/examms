package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubmaths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubmaths);
    }
    public void math1 (View v){
        Intent intent = new Intent(this,secsubmaths1.class);
        startActivity(intent);
    }
    public void math2 (View v){
        Intent intent = new Intent(this,secsubmaths2.class);
        startActivity(intent);
    }
}
