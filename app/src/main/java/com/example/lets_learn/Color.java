package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ListView listView=findViewById(R.id.colorList);
        ArrayList<colorList> ColorList = new ArrayList<colorList>();

        ColorList.add(new colorList("RED",R.raw.red));
        ColorList.add(new colorList("Blue",R.raw.blue));
        ColorList.add(new colorList("Black",R.raw.black));
        ColorList.add(new colorList("Brown",R.raw.brown));
        ColorList.add(new colorList("Green",R.raw.green));


        Adapter_color adapter = new Adapter_color(this, ColorList);


        listView.setAdapter(adapter);


    }
}