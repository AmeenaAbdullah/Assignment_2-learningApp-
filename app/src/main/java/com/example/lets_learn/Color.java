package com.example.lets_learn;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Color extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ListView listView=findViewById(R.id.colorList);
        ArrayList<colorList> ColorList = new ArrayList<colorList>();

        ColorList.add(new colorList(getResources().getColor(R.color.black),"RED", getResources().getColor(R.color.red)));
        ColorList.add(new colorList(getResources().getColor(R.color.black),"Blue",getResources().getColor(R.color.blue)));
        ColorList.add(new colorList(getResources().getColor(R.color.white),"Black",getResources().getColor(R.color.black)));
        ColorList.add(new colorList(getResources().getColor(R.color.black),"Brown",getResources().getColor(R.color.brown)));
        ColorList.add(new colorList(getResources().getColor(R.color.black),"Green",getResources().getColor(R.color.green)));

        ColorList.add(new colorList(getColor(R.color.black),"white",getColor(R.color.white)));
        Adapter_color adapter = new Adapter_color(this, ColorList);


        listView.setAdapter(adapter);
        TextView t=findViewById(R.id.color_name);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t.setText((CharSequence) ColorList.get(i));
            }
        });





    }
}