package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public void thankyou(View view){
        Intent intent6 = new Intent(this, Thanks.class);
        startActivity(intent6);

    }



    public void gotoactivities(View view){
        Intent intent7 = new Intent(this, Activities_Baguio.class);
        startActivity(intent7);

    }
}
