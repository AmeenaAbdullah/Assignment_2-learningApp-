package com.example.lets_learn;

public class QuizObj {
    public String ques;
    public int quesNo;
    public String choice1;
    public String choice2;
    public String choice3;

    public QuizObj(String ques, int quesn,String choice1, String choice2, String choice3) {
        this.ques = ques;
        this.quesNo=quesn;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
    }

    public String getQues() {
        return ques;
    }

    public String getChoice1() {
        return choice1;
    }


    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public int getQuesNo() {
        return quesNo;
    }
}
