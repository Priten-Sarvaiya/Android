package com.au.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayTextInTextbox extends AppCompatActivity {

    Button btn;
    TextView textView;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text_in_textbox);

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView3);
        next = findViewById(R.id.next);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Priten Sarvaiya");
                Toast.makeText(getApplicationContext(),"Priten Sarvaiya",Toast.LENGTH_LONG).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(DisplayTextInTextbox.this,LikeDislike.class);
                startActivity(next);
            }
        });
    }
}
