package com.londonappbrewery.magiceightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAsk;
        final ImageView imgView;
        imgView = findViewById(R.id.imageView);
        btnAsk = findViewById(R.id.btn_ask);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rng = new Random();
                int number = rng.nextInt(5);
                final int [] messageArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
                imgView.setImageResource(messageArray[number]);
                Log.d("Number", Integer.toString(number));

            }
        });

    }


}

