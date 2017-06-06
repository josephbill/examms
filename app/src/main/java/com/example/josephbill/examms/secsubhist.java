package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubhist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubhist);
    }
    public void hist1 (View v){
        Intent intent = new Intent(this,secsubhist1.class);
        startActivity(intent);
    }
    public void hist2 (View v){
        Intent intent = new Intent(this,secsubhist2.class);
        startActivity(intent);
    }

}
