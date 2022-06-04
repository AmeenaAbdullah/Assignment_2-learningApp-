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


    }
}