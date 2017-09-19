package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Select_Destination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__destination);
    }

    public void hotel_baguio(View view){
        Intent intent2 = new Intent(this, Baguio.class);
        startActivity(intent2);
    }
}
