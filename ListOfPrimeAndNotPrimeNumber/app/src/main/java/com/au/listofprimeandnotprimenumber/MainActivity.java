package com.au.listofprimeandnotprimenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText startRange,endRange;
    TextView displayOutput;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startRange = findViewById(R.id.startRange);
        endRange   = findViewById(R.id.endRange);

        submit     =findViewById(R.id.submit);
        displayOutput = findViewById(R.id.displayOutput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prime="",notprime="",output="";
                int i;
                int start = Integer.parseInt(startRange.getText().toString());
                int end   = Integer.parseInt(endRange.getText().toString());

                for(int j=start; j<=end; j++) {
                    for(i=2; i<=j-1; i++) {
                        if(j%i==0) {
                            prime += j+", ";
                            break;
                        }
                    }
                    if(i==j){
                        notprime += j+",";
                    }
                }
                output = "\n\nPrime Number :\n"+prime+"\n\nNot Prime Number :\n"+notprime;
                displayOutput.setText(output);
            }
        });
    }
}
