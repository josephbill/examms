package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubbusi1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubbusi1);
    }
    public void view (View v){
        Intent intent = new Intent(this,busi1view.class);
        startActivity(intent);
    }
}
