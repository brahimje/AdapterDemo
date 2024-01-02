package com.example.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        List<Country> countries = new ArrayList<>();

        countries.add(new Country(R.drawable.ma, "Morocco"));
        countries.add(new Country(R.drawable.sg, "Singapore"));
        countries.add(new Country(R.drawable.us, "United States"));

        CountryAdapter adapter = new CountryAdapter(this, R.layout.item_country, R.id.nameTV, countries);
        spinner.setAdapter(adapter);
        adapter.setDropDownViewResource(R.layout.item_country); // Set the custom layout for dropdown items


    }
}