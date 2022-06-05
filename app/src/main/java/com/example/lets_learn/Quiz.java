package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        quizList q = new quizList();

        ListView quizlistView=findViewById(R.id.QuizList);

        ArrayList<QuizObj> quizList=new ArrayList<>();

        Adapter_quiz adapter=new Adapter_quiz(this,quizList);


        quizList quess=new quizList();

        for(int i=0;i<quess.myQues.length;i++) {

            quizList.add(new QuizObj(quess.getQues(i), quess.getChoice1(i), quess.getChoice2(i), quess.getChoice3(i)));
        }
       quizlistView.setAdapter(adapter);

        quizlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });


    }

}