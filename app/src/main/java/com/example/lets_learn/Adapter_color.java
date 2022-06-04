package com.example.lets_learn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter_color extends ArrayAdapter<colorList>{

    public Adapter_color(@NonNull Context context, ArrayList<colorList> List) {
        super(context, 0, List);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        colorList s= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_cutomized_color_list ,parent, false);
        ImageView i=convertView.findViewById(R.id.colorimg);
        TextView t=convertView.findViewById(R.id.ColorName);

        i.setImageResource(s.Color);
        t.setText(s.ColorName);
        return convertView;
    }
}

