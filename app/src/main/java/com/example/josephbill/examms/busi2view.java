package com.example.josephbill.examms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Joseph Bill on 6/24/2017.
 */

public class busi2view extends AppCompatActivity {
  TextView busi2view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busi2view);
        busi2view = (TextView) findViewById(R.id.busi2view);
        //reading the method below
        String data = readTxt();
        busi2view.setText(data);
    }
    //this methods reads textfiles
    public String readTxt(){


        InputStream inputStream = null;
        try {
            inputStream = getResources().getAssets().open("files/file_1.txt");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1)
            {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }




}

