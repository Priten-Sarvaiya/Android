package com.au.actvandspinnerandprogresbarandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class screen2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    AutoCompleteTextView autoCompleteTextView;
    Spinner spinner;
    TextView actvItem,spinnerItem;
    String[] actors = {"Amitabh Bachchan","Aamir Khan","Ajay Devgn","Shah Rukh Khan","Hrithik Roshan"};
    String[] movies = {"The Shawshank Redemption","The Dark Knight"," Schindler's List"," The Lord of the Rings: The Return of the King","The Lord of the Rings: The Fellowship of the Ring"};
    ArrayAdapter spinnerAdapter;
    ImageView acter,movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        actvItem = findViewById(R.id.actvItem);
        spinner = findViewById(R.id.spinner);
        spinnerItem = findViewById(R.id.spinnerItem);


        final ArrayAdapter adapter = new ArrayAdapter(screen2.this,android.R.layout.simple_list_item_1,actors);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                actvItem.setText(adapter.getItem(i).toString());
                Toast.makeText(getApplicationContext(),adapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
                if(adapter.getItem(i).toString() == "Amitabh Bachchan") {
                    acter.setImageResource(R.drawable.amitabhbachchan);
                }
                if(adapter.getItem(i).toString() == "Aamir Khan") {
                    acter.setImageResource(R.drawable.aamirkhan);
                }
                if(adapter.getItem(i).toString() == "Ajay Devgn") {
                    acter.setImageResource(R.drawable.ajaydevgn);
                }
                if(adapter.getItem(i).toString() == "Shah Rukh Khan") {
                    acter.setImageResource(R.drawable.shahrukhkhan);
                }
                if(adapter.getItem(i).toString() == "Hrithik Roshan") {
                    acter.setImageResource(R.drawable.hrithikroshan);
                }
            }
        });

        spinner.setOnItemSelectedListener(this);
        spinnerAdapter = new ArrayAdapter(screen2.this,android.R.layout.simple_list_item_1,movies);
        spinner.setAdapter(spinnerAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        spinnerItem.setText(spinnerAdapter.getItem(i).toString());
        Toast.makeText(screen2.this,spinnerAdapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
//        if(spinnerAdapter.getItem(i).toString() == "The Shawshank Redemption") {
//            movie.setImageResource(R.drawable.theshawshankredemption);
//        }
//        if(spinnerAdapter.getItem(i).toString() == "The Dark Knight") {
//            movie.setImageResource(R.drawable.thedarkknight);
//        }
//        if(spinnerAdapter.getItem(i).toString() == "Schindler's List") {
//            movie.setImageResource(R.drawable.schindlerslist);
//        }
//        if(spinnerAdapter.getItem(i).toString() == "The Lord of the Rings: The Return of the King") {
//            movie.setImageResource(R.drawable.thelordoftheringsthereturnoftheking);
//        }
//        if(spinnerAdapter.getItem(i).toString() == "The Lord of the Rings: The Fellowship of the Ring") {
//            movie.setImageResource(R.drawable.thelordoftheringsthefellowshipofthering);
//        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
