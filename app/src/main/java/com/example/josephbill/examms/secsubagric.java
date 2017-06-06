package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubagric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubagric);
    }

    public void agric1 (View v){
        Intent intent = new Intent(this,secsubagric1.class);
        startActivity(intent);
    }

    public void agric2 (View v){
        Intent intent = new Intent(this,secsubagric2.class);
        startActivity(intent);
    }


}
