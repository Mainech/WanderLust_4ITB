package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activities_Baguio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_baguio);
    }

    public void summary(View view){
        Intent intent5 = new Intent(this, Summary.class);
        startActivity(intent5);
    }

    public void gotoactivityone(View view){
        Intent intent6 = new Intent(this, ActivityOne.class);
        startActivity(intent6);
    }



    public void gotohotels(View view){
        Intent intent7 = new Intent(this, Hotel_Baguio.class);
        startActivity(intent7);
    }

}
