package com.priten.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstValue,secondValue;
    TextView displayAns;
    Button add,sub,multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.firstValue);
        secondValue = findViewById(R.id.secondValue);

        displayAns = findViewById(R.id.displayAns);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first+second;
                displayAns.setText(""+ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first-second;
                displayAns.setText(""+ans);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first*second;
                displayAns.setText(""+ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int ans = first/second;
                displayAns.setText(""+ans);
            }
        });
    }
}