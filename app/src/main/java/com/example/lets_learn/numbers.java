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



        AlphabetList.add(new NumberList("1",R.drawable.circle,"One"));

        AlphabetList.add(new NumberList("2",R.drawable.two2,"Two"));

        AlphabetList.add(new NumberList("3",R.drawable.three,"Three"));

        AlphabetList.add(new NumberList("4",R.drawable.four,"Four"));
        AlphabetList.add(new NumberList("5",R.drawable.five,"Five"));
        AlphabetList.add(new NumberList("6",R.drawable.six,"Six"));
        AlphabetList.add(new NumberList("7",R.drawable.seven,"Seven"));
        AlphabetList.add(new NumberList("8",R.drawable.eight,"Eight"));

        AlphabetList.add(new NumberList("9",R.drawable.nine,"Nine"));
        AlphabetList.add(new NumberList("10",R.drawable.ten,"Ten"));

        Adapter_Numbers adapter = new Adapter_Numbers(this, AlphabetList);



        listView.setAdapter(adapter);
        TextView t=findViewById(R.id.shape_number);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                    t.setText("1");
                else if(i==1)
                    t.setText("2");
                else if(i==2)
                    t.setText("3");
                else if(i==3)
                    t.setText("4");
                else if(i==4)
                    t.setText("5");
                else if(i==5)
                    t.setText("6");
                else if(i==6)
                    t.setText("7");
                else if(i==7)
                    t.setText("8");
                else if(i==8)
                    t.setText("9");
                else if(i==9)
                    t.setText("10");
            }
        });

    }
}