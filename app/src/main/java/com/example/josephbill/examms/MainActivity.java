package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pributton (View v){
        Intent intent = new Intent(this,pributton.class);
        startActivity(intent);
    }

    public void secbutton (View v){
        Intent intent = new Intent(this,secbutton.class);
        startActivity(intent);
    }
}
