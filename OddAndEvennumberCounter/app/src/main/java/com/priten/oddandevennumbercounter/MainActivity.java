package com.priten.oddandevennumbercounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText startRange,endRange;
    TextView display;
    Button submit;
    String output="",evenOutput="",oddOutput="";
    int even=0,odd=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startRange = findViewById(R.id.startRange);
        endRange = findViewById(R.id.endRange);

        display = findViewById(R.id.display);

        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int start = Integer.parseInt(startRange.getText().toString());
                int end = Integer.parseInt(endRange.getText().toString());
                for (int i=start; i<=end; i++) {
                    if(i%2==0) {
                        even++;
                        evenOutput += i+", ";
                    }
                    else {
                        odd++;
                        oddOutput += i+", ";
                    }
                }
                output = "\nTotal Even number : "+even+"\n\n"+evenOutput+"\n\n\nTotal Odd number : "+odd+"\n\n"+oddOutput;
                display.setText(output);
                display.setMovementMethod(new ScrollingMovementMethod());
            }
        });
    }
}