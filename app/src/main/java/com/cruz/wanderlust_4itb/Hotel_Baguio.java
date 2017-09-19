package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hotel_Baguio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel__baguio);
    }

    public void baguioactivity(View view){
        Intent intent4 = new Intent(this, Activities_Baguio.class);
        startActivity(intent4);
    }


    public void hotelone(View view){
        Intent intent5 = new Intent(this, HotelOne.class);
        startActivity(intent5);
    }



    public void backtodestination(View view){
        Intent intent8 = new Intent(this, Baguio.class);
        startActivity(intent8);
    }

}
