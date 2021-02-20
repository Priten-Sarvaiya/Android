package com.au.reversenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button submit;
    TextView displayOutput;
    int reversenumber=0,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        submit = findViewById(R.id.submit);
        displayOutput = findViewById(R.id.displayOutput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Integer.parseInt(number.getText().toString());
                while(num>0) {
                    int n = num%10;
                    reversenumber = (reversenumber*10)+n;
                    num = num/10;
                }
                displayOutput.setText(""+reversenumber);
            }
        });
    }
}
