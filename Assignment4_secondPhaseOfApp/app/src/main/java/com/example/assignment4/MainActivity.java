package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //WeatherAround button clicked handler
    public void onWeatherAround(View view){
        Intent intent=new Intent(this,WeatherAroundActivity.class);
        //start activity WeatherAroundActivity
        startActivity(intent);
    }

    //FactsAbout button clicked handler
    public void onFactsAbout(View view){
        Intent intent=new Intent(this,FactsActivity.class);
        //start activity FactsActivity
        startActivity(intent);
    }

    //InvestmentPortfolio button clicked handler
    public void onInvestmentPortfolio(View view){
        Intent intent=new Intent(this,InvestmentActivity.class);
        //start activity InvestmentActivity
        startActivity(intent);
    }

    //Resume button clicked handler
    public void onResume(View view){
        Intent intent=new Intent(this,ResumeActivity.class);
        //start activity ResumeActivity
        startActivity(intent);
    }

    //OtherFacts button clicked handler
    public void onOtherFacts(View view){
        Intent intent=new Intent(this,OtherFactsActivity.class);
        //start activity OtherFactsActivity
        startActivity(intent);
    }

    //Interaction button clicked handler
    public void onInteraction(View view){
        Intent intent=new Intent(this,InteractionActivity.class);
        //start activity InteractionActivity
        startActivity(intent);
    }
}