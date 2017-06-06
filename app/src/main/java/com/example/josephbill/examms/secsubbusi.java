package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubbusi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubbusi);
    }

    public void busi1 (View v){
        Intent intent = new Intent(this,secsubbusi1.class);
        startActivity(intent);
    }
    public void busi2 (View v){
        Intent intent = new Intent(this,secsubbusi2.class);
        startActivity(intent);
    }
}
