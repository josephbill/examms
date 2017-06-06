package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubbio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubbio);
    }

    public void bio1 (View v){
        Intent intent = new Intent(this,secsubbio1.class);
        startActivity(intent);
    }

    public void bio2 (View v){
        Intent intent = new Intent(this,secsubbio2.class);
        startActivity(intent);
    }
}
