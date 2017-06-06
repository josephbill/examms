package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubchem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubchem);
    }
    public void chem1 (View v){
        Intent intent = new Intent(this,secsubchem1.class);
        startActivity(intent);
    }
    public void chem2 (View v){
        Intent intent = new Intent(this,secsubchem2.class);
        startActivity(intent);
    }
}
