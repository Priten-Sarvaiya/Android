package com.au.radiobuttonandcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checked;
    RadioGroup course;
    Button clear;
    TextView displayCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checked = findViewById(R.id.checked);
        course = findViewById(R.id.course);
        displayCourse = findViewById(R.id.displayCourse);
        clear = findViewById(R.id.clear);

        checked.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    checked.setText("Checked");

                }
                else {
                    checked.setText("Unchecked");
                }
            }
        });

        course.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                if(radioButton!=null) {
                    displayCourse.setText(radioButton.getText());
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                course.clearCheck();
                displayCourse.setText("Please Select Course");
            }
        });
    }
}
