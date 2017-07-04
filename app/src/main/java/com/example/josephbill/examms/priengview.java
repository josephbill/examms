package com.example.josephbill.examms;
// created by Joseph Bill
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class priengview extends AppCompatActivity {
    TextView priengview;
    Button print;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priengview);
        priengview = (TextView) findViewById(R.id.priengview);
        print = (Button) findViewById(R.id.print1);
        //reading the method below
        String data = readTxt();
        priengview.setText(data);
    }

   //when print button is pressed
    public void view (View v){
        Intent intent = new Intent(this,engprint.class);
        startActivity(intent);
    }


    //this method reads textfiles
    public String readTxt() {


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
            while (i != -1) {
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
