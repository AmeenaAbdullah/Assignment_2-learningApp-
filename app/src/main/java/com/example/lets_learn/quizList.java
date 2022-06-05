package com.example.lets_learn;

public class quizList {


   public String myQues[]={"1.What is 3+7 ?" ,
                      "2. A for __________ ?" ,
                      "3. How many days in a week ?",
                      "4. The Colour of banana is ?",
                       "5. Z for _____________? ",
                       "6.How many letters are there in the alphabets ?",
                       ""

   };
    public String choice[][]={
            { "4","10","17"} ,
            { "Banana","Apple ","Kettle"} ,
            { "4","8","7"} ,
            { "Yellow","blue","red"} ,
            { "ink","zip","lion"} ,
            { "32","26","17"} ,


    };

    public String myAns[]={"10","Apple","7","Yellow","zip","26"


    };

   public String getQues(int a){
       return myQues[a];
   }
    public String getChoice1(int a){
        return choice[a][0];
    }
    public String getChoice2(int a){
        return choice[a][1];
    }
    public String getChoice3(int a){
        return choice[a][2];
    }
    public String getCorrectChoice(int a){
       return myAns[a];
    }

}
