package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class aphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aphabets);
        ListView listView=findViewById(R.id.alphabetlst);
        ArrayList<colorList> AlphabetList = new ArrayList<colorList>();

        AlphabetList.add(new colorList(getResources().getColor(R.color.black),"RED", getResources().getColor(R.color.red)));
        AlphabetList.add(new colorList(getResources().getColor(R.color.black),"Blue",getResources().getColor(R.color.blue)));
        AlphabetList.add(new colorList(getResources().getColor(R.color.white),"Black",getResources().getColor(R.color.black)));
        AlphabetList.add(new colorList(getResources().getColor(R.color.black),"Brown",getResources().getColor(R.color.brown)));
        AlphabetList.add(new colorList(getResources().getColor(R.color.black),"Green",getResources().getColor(R.color.green)));

        AlphabetList.add(new colorList(getColor(R.color.black),"white",getColor(R.color.white)));
        Adapter_color adapter = new Adapter_color(this, ColorList);


        listView.setAdapter(adapter);
        TextView t=findViewById(R.id.color_name);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                    t.setText("RED");
                else if(i==1)
                    t.setText("BLUE");
                else if(i==2)
                    t.setText("BLACK");
                else if(i==3)
                    t.setText("BROWN");
                else if(i==4)
                    t.setText("GREEN");
                else if(i==5)
                    t.setText("WHITE");
            }
        });

    }
}