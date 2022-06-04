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

public class Adapter_alphabet  extends ArrayAdapter<alphabtelist> {

    public Adapter_alphabet(@NonNull Context context, ArrayList<alphabtelist> List) {
        super(context, 0, List);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        alphabtelist a= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_customized_alphabet ,parent, false);
        ImageView i=convertView.findViewById(R.id.img);
        i.setImageResource(a.img);
        TextView t=convertView.findViewById(R.id.Alphabet);
        t.setText(a.Name);
        TextView t1=convertView.findViewById(R.id.wordA);
        t1.setText(a.word);
        return convertView;
    }
}
