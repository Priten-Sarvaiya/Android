package com.au.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextView displayItem;
    String[] movies = {"The Shawshank Redemption","The Dark Knight","Schindler's List","The Lord of the Rings: The Return of the King","The Lord of the Rings: The Fellowship of the Ring"};
    ArrayAdapter adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        displayItem = findViewById(R.id.displayItem);
        imageView = findViewById(R.id.imageView);

        spinner.setOnItemSelectedListener(this);

        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,movies);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        displayItem.setText(adapter.getItem(i).toString());
        Toast.makeText(MainActivity.this,adapter.getItem(i).toString(),Toast.LENGTH_LONG).show();
        if(adapter.getItem(i).toString() == "The Shawshank Redemption") {
            imageView.setImageResource(R.drawable.theshawshankredemption);
        }
        if(adapter.getItem(i).toString() == "The Dark Knight") {
            imageView.setImageResource(R.drawable.thedarkknight);
        }
        if(adapter.getItem(i).toString() == "Schindler's List") {
            imageView.setImageResource(R.drawable.schindlerslist);
        }
        if(adapter.getItem(i).toString() == "The Lord of the Rings: The Return of the King") {
            imageView.setImageResource(R.drawable.thelordoftheringsthereturnoftheking);
        }
        if(adapter.getItem(i).toString() == "The Lord of the Rings: The Fellowship of the Ring") {
            imageView.setImageResource(R.drawable.thelordoftheringsthefellowshipofthering);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
