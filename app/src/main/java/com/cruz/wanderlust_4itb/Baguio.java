package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Baguio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baguio);
    }

    public void gotohotel(View view){
        Intent intent3 = new Intent(this, Hotel_Baguio.class);
        startActivity(intent3);
    }

    public void backtodestination(View view){
        Intent intent8 = new Intent(this, Select_Destination.class);
        startActivity(intent8);
    }
}
