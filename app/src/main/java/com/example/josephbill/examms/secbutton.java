package com.example.josephbill.examms;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class secbutton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secbutton);
    }
    public void English (View v){
        Intent intent = new Intent(this,secsubeng.class);
        startActivity(intent);
    }
    public void Kiswahili (View v){
        Intent intent = new Intent(this,secsubkiswa.class);
        startActivity(intent);
    }
    public void Mathematics (View v){
        Intent intent = new Intent(this,secsubmaths.class);
        startActivity(intent);
    }
    public void bio (View v){
        Intent intent = new Intent(this,secsubbio.class);
        startActivity(intent);
    }
    public void physics (View v){
        Intent intent = new Intent(this,secsubphy.class);
        startActivity(intent);
    }
    public void chem (View v){
        Intent intent = new Intent(this,secsubchem.class);
        startActivity(intent);
    }
    public void history (View v){
        Intent intent = new Intent(this,secsubhist.class);
        startActivity(intent);
    }
    public void Geography (View v){
        Intent intent = new Intent(this,secsubgeo.class);
        startActivity(intent);
    }
    public void busi (View v){
        Intent intent = new Intent(this,secsubbusi.class);
        startActivity(intent);
    }
    public void compss (View v){
        Intent intent = new Intent(this,secsubcomps.class);
        startActivity(intent);
    }
    public void Agricc (View v){
        Intent intent = new Intent(this,secsubagric.class);
        startActivity(intent);
    }
    public void cre (View v){
        Intent intent = new Intent(this,secsubcre.class);
        startActivity(intent);
    }


}
