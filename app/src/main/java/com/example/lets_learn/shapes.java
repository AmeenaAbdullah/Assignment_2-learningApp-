package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class shapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        ListView listView=findViewById(R.id.colorList);
        ArrayList<ShapeList> List = new ArrayList<ShapeList>();
        List.add(new ShapeList(R.drawable.diamond,"Diamond"));
        List.add(new ShapeList(R.drawable.circle,"Circle"));
        List.add(new ShapeList(R.drawable.oval,"Oval"));
        List.add(new ShapeList(R.drawable.rectangle,"Rectangle"));
        List.add(new ShapeList(R.drawable.hexagon,"Hexagon"));
        List.add(new ShapeList(R.drawable.star,"Star"));
        List.add(new ShapeList(R.drawable.square,"Square"));
        Adapter_shape adapter = new Adapter_shape(this, List);


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
            }
        });

    }
}