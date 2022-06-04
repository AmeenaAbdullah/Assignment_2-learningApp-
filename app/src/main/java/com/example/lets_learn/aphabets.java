package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class aphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aphabets);
        ListView listView=findViewById(R.id.alphabetlst);
        ArrayList<colorList> AlphabetList = new ArrayList<colorList>();

        AlphabetList.add(new colorList("A",R.raw.a));
        AlphabetList.add(new colorList("B",R.raw.b));
        AlphabetList.add(new colorList("D",R.raw.c));
        AlphabetList.add(new colorList("E",R.raw.d));
        AlphabetList.add(new colorList("F",R.raw.e));

        AlphabetList.add(new colorList("F",R.raw.f));
        AlphabetList.add(new colorList("G",R.raw.g));
        AlphabetList.add(new colorList("H",R.raw.h));
        AlphabetList.add(new colorList("I",R.raw.i));
        AlphabetList.add(new colorList("J",R.raw.j));
        AlphabetList.add(new colorList("K",R.raw.k));
        AlphabetList.add(new colorList("L",R.raw.l));
        AlphabetList.add(new colorList("M",R.raw.m));
        AlphabetList.add(new colorList("N",R.raw.n));
        AlphabetList.add(new colorList("O",R.raw.o));
        AlphabetList.add(new colorList("P",R.raw.p));
        AlphabetList.add(new colorList("Q",R.raw.q));
        AlphabetList.add(new colorList("R",R.raw.r));
        AlphabetList.add(new colorList("S",R.raw.s));
        AlphabetList.add(new colorList("T",R.raw.t));
        AlphabetList.add(new colorList("U",R.raw.u));
        AlphabetList.add(new colorList("V",R.raw.v));
        AlphabetList.add(new colorList("W",R.raw.w));
        AlphabetList.add(new colorList("X",R.raw.x));
        AlphabetList.add(new colorList("Y",R.raw.y));
        AlphabetList.add(new colorList("Z",R.raw.z));

        Adapter_color adapter = new Adapter_color(this, AlphabetList);


        listView.setAdapter(adapter);
    }
}