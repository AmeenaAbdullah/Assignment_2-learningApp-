package com.example.lets_learn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter_quiz extends ArrayAdapter<QuizObj> {
    public Adapter_quiz(@NonNull Context context, @NonNull List<QuizObj> objects) {
        super(context, 0,objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       QuizObj q= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_customized_quiz ,parent, false);

        TextView t=convertView.findViewById(R.id.ques);
        t.setText(q.ques);

        RadioButton r1=convertView.findViewById(R.id.choice1);
        RadioButton r2=convertView.findViewById(R.id.choice2);
        RadioButton r3=convertView.findViewById(R.id.choice3);
        r1.setText(q.choice1);
        r2.setText(q.choice2);
        r3.setText(q.choice3);
        return convertView;
    }
}
