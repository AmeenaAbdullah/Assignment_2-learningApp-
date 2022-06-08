package com.example.lets_learn;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class Adapter_quiz extends ArrayAdapter<QuizObj> {
    int selectedPosition = 0;
    public Adapter_quiz(@NonNull Context context, @NonNull List<QuizObj> objects) {

        super(context, 0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       QuizObj q= getItem(position);
       quizList quiz=new quizList();

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_customized_quiz ,parent, false);

        TextView t=convertView.findViewById(R.id.ques);
        t.setText(q.ques);

        TextView tno=convertView.findViewById(R.id.num);
        tno.setText(String.valueOf(q.quesNo));

        RadioButton r1=convertView.findViewById(R.id.choice1);
        RadioButton r2=convertView.findViewById(R.id.choice2);
        RadioButton r3=convertView.findViewById(R.id.choice3);

         if(q.quesNo==10){
             //end
             View b = convertView.findViewById(R.id.submit_B);
             View c1 = convertView.findViewById(R.id.choice1);
             View c2 = convertView.findViewById(R.id.choice2);
             View c3 = convertView.findViewById(R.id.choice3);
             b.setVisibility(View.VISIBLE);
             c1.setVisibility(View.INVISIBLE);
             c2.setVisibility(View.INVISIBLE);
             c3.setVisibility(View.INVISIBLE);


         }
         else {




             r1.setText(q.choice1);
             r2.setText(q.choice2);
             r3.setText(q.choice3);
         }
         return convertView;
    }
}
