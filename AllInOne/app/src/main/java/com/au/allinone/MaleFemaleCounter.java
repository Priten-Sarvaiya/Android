package com.au.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MaleFemaleCounter extends AppCompatActivity {

    ImageButton next;
    TextView maleCounter,femaleCounter;
    Button male,female;
    int totalMale=0,totalFemale=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female_counter);

        next = findViewById(R.id.next);
        maleCounter = findViewById(R.id.maleCounter);
        femaleCounter = findViewById(R.id.femaleCounter);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalMale++;
                maleCounter.setText(""+totalMale);
                Toast.makeText(getApplicationContext(),"Total Male : "+totalMale, Toast.LENGTH_LONG).show();
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalFemale++;
                femaleCounter.setText(""+totalFemale);
                Toast.makeText(getApplicationContext(),"Total Female : "+totalFemale,Toast.LENGTH_LONG).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MaleFemaleCounter.this,DisplayTextInTextbox.class);
                startActivity(next);
            }
        });
    }
}
