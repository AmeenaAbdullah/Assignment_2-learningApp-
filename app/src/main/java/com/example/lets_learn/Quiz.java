package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AppCompatActivity {
      RadioButton rb;
      RadioGroup rg;
    ListView quizlistView;
    quizList quess = new quizList();
    public String select[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        quizList q = new quizList();
        ListView quizlistView = findViewById(R.id.QuizList);

        ArrayList<QuizObj> quizList = new ArrayList<>();

       Adapter_quiz adapter = new Adapter_quiz(this, quizList);



        rg=findViewById(R.id.rg);
        for (int i = 0; i < quess.myQues.length; i++) {

            quizList.add(new QuizObj(quess.getQues(i), i , quess.getChoice1(i), quess.getChoice2(i), quess.getChoice3(i)));
        }
        quizList.add(new QuizObj("", 10, "", "", ""));

        quizlistView.setAdapter(adapter);

        quizlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  int r=rg.getCheckedRadioButtonId();
               // rb=findViewById(r);

            }
        });


    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton radioButton = null;
        String radiobtn= (String) ((RadioButton) view).getText();
        // Check which radio button was clicked
        switch(view.getId()) {
            //radioButton = (RadioButton)findViewById(view.getId());
           case R.id.choice1:
                if (checked)
                    //radioButton = (RadioButton) findViewById(R.id.choice1);
                    // Pirates are the best
                    break;
            case R.id.choice2:
                if (checked)
                   // radioButton = (RadioButton) findViewById(R.id.choice2);
                    // Ninjas rule
                    break;
            case R.id.choice3:
                if (checked)
                  //  radioButton = (RadioButton) findViewById(R.id.choice3);
                    // Ninjas rule
                    break;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
      
        
        View position = (View) view.getParent();
        View position1=(View) position.getParent();
        View position2=(View) position1.getParent();

        View position3=(View) position2.getParent();

        View position4=(View) position3.getParent();
        ListView listView = (ListView) position4;
        int index = listView.getPositionForView(position3);

        Toast.makeText(getApplicationContext(),String.valueOf(index), Toast.LENGTH_SHORT).show();


     Toast.makeText(Quiz.this, radiobtn, Toast.LENGTH_SHORT).show();
        if(radioButton!=null) {
            String g=radiobtn;
            select[index]=g;
        }
    }

    public void Submit(View view) {

        int score = 0;
        for (int i = 0; i < quess.myQues.length; i++) {
            if (select[i] == quess.getCorrectChoice(i))
            {
                score++;
             }
        }
        String s= String.valueOf(score);
        Intent i=new Intent(Quiz.this,score.class);

     i.putExtra("score", s);
        startActivity(i);
    }

}