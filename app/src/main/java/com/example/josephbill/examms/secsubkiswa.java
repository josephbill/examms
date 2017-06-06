package com.example.josephbill.examms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secsubkiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secsubkiswa);
    }
    public void kisw1 (View v){
        Intent intent = new Intent(this,secsubkiswa1.class);
        startActivity(intent);
    }
    public void kisw2 (View v){
        Intent intent = new Intent(this,secsubkiswa2.class);
        startActivity(intent);
    }
}
