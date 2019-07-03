package com.example.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bmiCardView,bmrCardView,kcalCardView,foodsuggestCardView,historyCardView,palCardView,loginCardView,registerCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmiCardView=findViewById(R.id.BMIcardviewID);
        bmrCardView=findViewById(R.id.BMRcardviewID);
        kcalCardView=findViewById(R.id.KCALcardviewID);
        foodsuggestCardView=findViewById(R.id.FoodsuggestcardviewID);
        historyCardView=findViewById(R.id.HistorycardviewID);
        palCardView=findViewById(R.id.PALcardviewID);
        loginCardView=findViewById(R.id.LOGINcardviewID);
        registerCardView=findViewById(R.id.RegistercardviewID);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.BMIcardviewID)
        {
            Intent intent =new Intent(MainActivity.this,BMIActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.BMRcardviewID)
        {

        }
        else if(v.getId()==R.id.KCALcardviewID)
        {

        }
        else if(v.getId()==R.id.FoodsuggestcardviewID)
        {

        }
        else if(v.getId()==R.id.HistorycardviewID)
        {

        }
        else if(v.getId()==R.id.PALcardviewID)
        {

        }
        else if(v.getId()==R.id.LOGINcardviewID)
        {

        }
        else if(v.getId()==R.id.RegistercardviewID)
        {

        }


    }
}
