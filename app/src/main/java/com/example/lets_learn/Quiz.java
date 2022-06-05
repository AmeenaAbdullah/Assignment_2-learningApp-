package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

            quizList.add(new QuizObj(quess.getQues(i),i, quess.getChoice1(i), quess.getChoice2(i), quess.getChoice3(i)));
        }
        quizList.add(new QuizObj("",10,"","",""));

       quizlistView.setAdapter(adapter);

        quizlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });


        Button b=findViewById(R.id.submit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz.this,score.class));
            }
        });


    }

}