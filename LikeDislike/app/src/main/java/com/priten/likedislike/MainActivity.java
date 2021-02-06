package com.priten.likedislike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button likeIn,likeDe,dislikeIn,dislikeDe;
    TextView like,dislike;
    int likeCount=0,dislikeCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        likeIn = findViewById(R.id.likeIn);
        likeDe = findViewById(R.id.likeDe);
        dislikeIn = findViewById(R.id.dislikeIn);
        dislikeDe = findViewById(R.id.dislikeDe);
        like = findViewById(R.id.like);
        dislike = findViewById(R.id.dislike);

        likeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeCount++;
                Toast.makeText(getApplicationContext(),"Like increment -- "+likeCount,Toast.LENGTH_LONG).show();
                like.setText(String.valueOf(likeCount));
            }
        });
        likeDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeCount--;
                Toast.makeText(getApplicationContext(),"Like decrement -- "+likeCount,Toast.LENGTH_LONG).show();
                like.setText(String.valueOf(likeCount));
            }
        });
        dislikeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislikeCount++;
                Toast.makeText(getApplicationContext(),"Like increment -- "+dislikeCount,Toast.LENGTH_LONG).show();
                dislike.setText(String.valueOf(dislikeCount));
            }
        });
        dislikeDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislikeCount--;
                Toast.makeText(getApplicationContext(),"Like decrement -- "+dislikeCount,Toast.LENGTH_LONG).show();
                dislike.setText(String.valueOf(dislikeCount));
            }
        });
    }
}