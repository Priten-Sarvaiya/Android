package com.au.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar marioRatingBar,pubgRatingBar,freefireRatingBar,amongusRatingBar;
    TextView marioRating,pubgRating,freefireRating,amongusRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marioRatingBar = findViewById(R.id.marioRatingBar);
        marioRating = findViewById(R.id.marioRating);

        pubgRatingBar = findViewById(R.id.pubgRatingBar);
        pubgRating = findViewById(R.id.pubgRating);

        freefireRatingBar = findViewById(R.id.freefireRatingBar);
        freefireRating = findViewById(R.id.freefireRating);

        amongusRatingBar = findViewById(R.id.amongusRatingBar);
        amongusRating = findViewById(R.id.amongusRating);

        marioRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                marioRating.setText("Rating : "+v);
                Toast.makeText(MainActivity.this,"Mario Rating : "+v,Toast.LENGTH_LONG).show();
            }
        });

        pubgRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                pubgRating.setText("Rating : "+v);
                Toast.makeText(MainActivity.this,"Pubg Rating : "+v,Toast.LENGTH_LONG).show();
            }
        });

        freefireRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                freefireRating.setText("Rating : "+v);
                Toast.makeText(MainActivity.this,"FreeFire Rating : "+v,Toast.LENGTH_LONG).show();
            }
        });

        amongusRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                amongusRating.setText("Rating : "+v);
                Toast.makeText(MainActivity.this,"AmongUs Rating : "+v,Toast.LENGTH_LONG).show();
            }
        });
    }
}
