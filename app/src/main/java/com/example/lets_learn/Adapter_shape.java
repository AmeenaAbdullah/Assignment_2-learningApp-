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

public class Adapter_shape extends ArrayAdapter<ShapeList> {

    public Adapter_shape(@NonNull Context context, ArrayList<ShapeList> List) {
        super(context, 0, List);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ShapeList s= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_customized_shapes ,parent, false);
        TextView t=convertView.findViewById(R.id.Name_S);
        ImageView i=convertView.findViewById(R.id.shapes);
        t.setText(s.name);
        i.setImageResource(s.img);
        return convertView;

    }
}
