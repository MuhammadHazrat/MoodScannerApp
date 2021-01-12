package com.example.uetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.security.SecureRandom;
import java.util.Random;

public class screen3 extends AppCompatActivity {

    ImageView moodImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        SecureRandom random = new SecureRandom();
        random.nextInt(51);
        String pic = "_" + random;

//        moodImg.setImageResource(R.drawable.pic);
    }

    public void tryAgainClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}