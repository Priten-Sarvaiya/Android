package com.au.autocomplatetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoComplateTextView;
    TextView displaItem;
    String[] actors = {"Amitabh Bachchan","Aamir Khan","Ajay Devgn","Shah Rukh Khan","Hrithik Roshan"};
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComplateTextView = findViewById(R.id.autoComplateTextView);
        displaItem = findViewById(R.id.displayItem);
        imageView = findViewById(R.id.imageView);

        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,actors);
        autoComplateTextView.setThreshold(1);
        autoComplateTextView.setAdapter(adapter);
        autoComplateTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                displaItem.setText(adapter.getItem(i).toString());
                Toast.makeText(getApplicationContext(),adapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
                if(adapter.getItem(i).toString() == "Amitabh Bachchan") {
                    imageView.setImageResource(R.drawable.amitabhbachchan);
                }
                if(adapter.getItem(i).toString() == "Aamir Khan") {
                    imageView.setImageResource(R.drawable.aamirkhan);
                }
                if(adapter.getItem(i).toString() == "Ajay Devgn") {
                    imageView.setImageResource(R.drawable.ajaydevgn);
                }
                if(adapter.getItem(i).toString() == "Shah Rukh Khan") {
                    imageView.setImageResource(R.drawable.shahrukhkhan);
                }
                if(adapter.getItem(i).toString() == "Hrithik Roshan") {
                    imageView.setImageResource(R.drawable.hrithikroshan);
                }
            }
        });

    }
}
