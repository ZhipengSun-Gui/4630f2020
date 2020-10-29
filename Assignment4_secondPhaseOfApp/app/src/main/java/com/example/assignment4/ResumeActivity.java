package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        //read resume and display the resume
        readResume();
    }

    void readResume(){
        try {
            //open the resume file
            InputStream stream=getAssets().open("Resume.txt");
            InputStreamReader streamReader = new InputStreamReader(stream,"UTF-8");
            BufferedReader reader = new BufferedReader(streamReader);
            String line="";
            String str= "";

            //loop to read lines from the file
            while((line = reader.readLine()) != null)
                str=str+line+"\n";

            //display the resume
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(str);

            //close the BufferedReader, InputStreamReader and InputStream
            reader.close();
            streamReader.close();
            stream.close();
        } catch (Exception e) {
        }
    }
}