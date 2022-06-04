package com.example.lets_learn;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Color extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ListView listView=findViewById(R.id.colorList);
        ArrayList<colorList> ColorList = new ArrayList<colorList>();

        ColorList.add(new colorList(getColor(R.color.black),"RED", getColor(R.color.red)));
        ColorList.add(new colorList(getColor(R.color.black),"Blue",getColor(R.color.blue)));
        ColorList.add(new colorList(getColor(R.color.white),"Black",getColor(R.color.black)));
        ColorList.add(new colorList(getColor(R.color.black),"Brown",getColor(R.color.brown)));
        ColorList.add(new colorList(getColor(R.color.black),"Green",getColor(R.color.green)));

        ColorList.add(new colorList(getColor(R.color.black),"white",getColor(R.color.white)));
        Adapter_color adapter = new Adapter_color(this, ColorList);


        listView.setAdapter(adapter);






    }
}