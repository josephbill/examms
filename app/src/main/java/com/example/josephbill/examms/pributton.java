package com.example.josephbill.examms;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class pributton extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pributton);
    }
    public void English (View v){
        Intent intent = new Intent(this,prisubeng.class);
        startActivity(intent);
    }
    public void Kiswahili (View v){
        Intent intent = new Intent(this,prisubkiswa.class);
        startActivity(intent);
    }
    public void Mathematics (View v){
        Intent intent = new Intent(this,prisubmaths.class);
        startActivity(intent);
    }
    public void ssc (View v){
        Intent intent = new Intent(this,prisubssc.class);
        startActivity(intent);
    }
    public void science (View v){
        Intent intent = new Intent(this,prisubscien.class);
        startActivity(intent);
    }



    }


