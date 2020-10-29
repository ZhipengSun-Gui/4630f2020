package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InteractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);
    }

    //Display button clicked handler
    public void onDisplay(View view){
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2 = (TextView)findViewById(R.id.textView2);

        //get current time
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String str=df.format(new Date());
        //display current time
        textView1.setText(str);

        //generate a random number between 0-100
        int num= (int) (Math.random() * 100);
        //display the random number
        textView2.setText(""+num);
    }
}