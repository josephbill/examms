package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubbio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubbio2);
    }
    public void view (View v){
        Intent intent = new Intent(this,bio2view.class);
        startActivity(intent);
    }
}
