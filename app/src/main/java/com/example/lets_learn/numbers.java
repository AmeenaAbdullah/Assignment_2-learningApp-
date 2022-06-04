package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ListView listView=findViewById(R.id.list_number);

        ArrayList<NumberList> AlphabetList = new ArrayList<NumberList>();


        Adapter_Numbers adapter = new Adapter_Numbers(this, AlphabetList);


        AlphabetList.add(new NumberList("1",R.drawable.circle,"One"));

        AlphabetList.add(new NumberList("2",R.drawable.two2,"Two"));

        AlphabetList.add(new NumberList("3",R.drawable.three,"Three"));

        AlphabetList.add(new NumberList("4",R.drawable.four,"Four"));
        AlphabetList.add(new NumberList("5",R.drawable.five,"Five"));
        AlphabetList.add(new NumberList("6",R.drawable.six,"Six"));
        AlphabetList.add(new NumberList("7",R.drawable.seven,"Seven"));
        AlphabetList.add(new NumberList("8",R.drawable.eight,"Eight"));

        AlphabetList.add(new NumberList("9",R.drawable.ii,"Nine"));
        AlphabetList.add(new NumberList("10",R.drawable.jj,"Ten"));




        Adapter_Numbers adapter = new Adapter_Numbers(this, AlphabetList);


        listView.setAdapter(adapter);
        TextView t=findViewById(R.id.shape_number);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                    t.setText("Diamond");
                else if(i==1)
                    t.setText("Circle");
                else if(i==2)
                    t.setText("Oval");
                else if(i==3)
                    t.setText("Rectangle");
                else if(i==4)
                    t.setText("Hexagon");
                else if(i==5)
                    t.setText("Star");
                else if(i==6)
                    t.setText("Square");
            }
        });

    }
}