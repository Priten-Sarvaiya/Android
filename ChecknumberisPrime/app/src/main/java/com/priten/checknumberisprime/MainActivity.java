package com.priten.checknumberisprime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button submit;
    TextView displayResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        submit = findViewById(R.id.submit);
        displayResult = findViewById(R.id.displayResult);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num  = Integer.parseInt(number.getText().toString()),i;
                for (i=2; i<=num-1; i++) {
                    if(num%i==0)
                        break;
                }
                if(i==num)
                    displayResult.setText(num+" is Prime");
                else
                    displayResult.setText(num+" is not Prime");
            }
        });
    }
}