package com.example.josephbill.examms;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import java.io.ByteArrayOutputStream;
        import java.io.IOException;
        import java.io.InputStream;

public class bio2view extends AppCompatActivity {
    TextView bio2view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio2view);

        bio2view = (TextView) findViewById(R.id.bio2view);
        //reading the method below
        String data = readTxt();
        bio2view.setText(data);
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
