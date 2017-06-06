package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubcre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubcre);
    }
    public void cre1 (View v){
        Intent intent = new Intent(this,secsubcre1.class);
        startActivity(intent);
    }
    public void cre2 (View v){
        Intent intent = new Intent(this,secsubcre2.class);
        startActivity(intent);
    }

}
