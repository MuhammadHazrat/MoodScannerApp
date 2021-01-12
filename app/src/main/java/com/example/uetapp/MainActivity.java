package com.example.uetapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ImageView unMaleIMG;
    ImageView unFemaleIMG;
    Boolean isClicked = false;
    ImageView shareUsImg;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        unMaleIMG = findViewById(R.id.unMaleIMG);;
        unFemaleIMG = findViewById(R.id.unFemaleIMG);;
        shareUsImg = findViewById(R.id.shareUsImg);

//      Male Button Clicked
        unMaleIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = true;
                unMaleIMG.setImageResource(R.drawable.male_select);
                unFemaleIMG.setImageResource(R.drawable.female_unslelect);
            }
        });

//      Female Button Clicked
        unFemaleIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked = true;
                unFemaleIMG.setImageResource(R.drawable.female_select);
                unMaleIMG.setImageResource(R.drawable.male_unselect);
            }
        });

//        Share Us Clicked
        shareUsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = "Here is the share content body";
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share via"));
            }
        });



    }


    public void scanned(View view) {
        if(isClicked) {
            Intent intent = new Intent(this, screen2.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_LONG).show();
        }
    }

//    public void sendData(View view){
//        TextView textView = findViewById(R.id.textView);
//        Intent sendintent = new Intent();
//        sendintent.setAction(Intent.ACTION_SEND);
//        sendintent.putExtra(Intent.EXTRA_TEXT, textView.getText());
//        sendintent.setType("text/plain");
//        startActivity(sendintent);
//    }


}

