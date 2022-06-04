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

import java.util.List;

public class Adapter_alphabet  extends ArrayAdapter<alphabtelist> {

    public Adapter_alphabet(@NonNull Context context, int resource, @NonNull List<alphabtelist> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        alphabtelist s= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_cutomized_color_list ,parent, false);
        ImageView i=convertView.findViewById(R.id.colorimg);
        TextView t=convertView.findViewById(R.id.color_name);

        i.setImageResource(s.img);
        t.setText(s.Name);
        return convertView;
    }
}
