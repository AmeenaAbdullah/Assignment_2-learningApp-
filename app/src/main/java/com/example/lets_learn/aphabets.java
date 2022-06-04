package com.example.lets_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class aphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aphabets);
        ListView listView=findViewById(R.id.alphabetlst);
        ArrayList<alphabtelist> AlphabetList = new ArrayList<alphabtelist>();


        Adapter_alphabet adapter = new Adapter_alphabet(this, AlphabetList);


        AlphabetList.add(new alphabtelist("A",R.drawable.aa,"Apple"));

        AlphabetList.add(new alphabtelist("B",R.drawable.bb,"Butterfly"));

        AlphabetList.add(new alphabtelist("C",R.drawable.cc,"Candles"));

        AlphabetList.add(new alphabtelist("D",R.drawable.dd,"Dog"));
        AlphabetList.add(new alphabtelist("E",R.drawable.ee,"Elephant"));
        AlphabetList.add(new alphabtelist("F",R.drawable.ff,"Fish"));
        AlphabetList.add(new alphabtelist("G",R.drawable.gg,"Gift"));
        AlphabetList.add(new alphabtelist("H",R.drawable.hh,"House"));

        AlphabetList.add(new alphabtelist("I",R.drawable.ii,"Island"));
        AlphabetList.add(new alphabtelist("J",R.drawable.jj,"JellyFish"));

        AlphabetList.add(new alphabtelist("K",R.drawable.kk,"Kettle"));

        AlphabetList.add(new alphabtelist("L",R.drawable.ll,"Lion"));
        AlphabetList.add(new alphabtelist("M",R.drawable.mm,"Mashroom"));
        AlphabetList.add(new alphabtelist("N",R.drawable.nn,"Nest"));
        AlphabetList.add(new alphabtelist("O",R.drawable.oo,"Orange"));
        AlphabetList.add(new alphabtelist("P",R.drawable.pp,"Panda"));
        AlphabetList.add(new alphabtelist("Q",R.drawable.qq,"Queen"));
        AlphabetList.add(new alphabtelist("R",R.drawable.rr,"Rainbow"));
        AlphabetList.add(new alphabtelist("S",R.drawable.ss,"Sandals"));
        AlphabetList.add(new alphabtelist("T",R.drawable.tt,"Train"));
        AlphabetList.add(new alphabtelist("U",R.drawable.uu,"Umbrella"));
        AlphabetList.add(new alphabtelist("V",R.drawable.vv,"Van"));
        AlphabetList.add(new alphabtelist("W",R.drawable.ww,"WaterMelon"));
        AlphabetList.add(new alphabtelist("X",R.drawable.xx,"X-ray"));

        AlphabetList.add(new alphabtelist("Y",R.drawable.yy,"Yocht"));
        AlphabetList.add(new alphabtelist("Z",R.drawable.zz,"Zip"));



        listView.setAdapter(adapter);
        TextView t=findViewById(R.id.alphabet_number);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent send = new Intent(aphabets.this, Alphabets.class);
                if(i==0)
                    send.putExtra("alphabet","a");
                else if(i==1)
                    send.putExtra("alphabet","b");
                else if(i==2)
                    send.putExtra("alphabet","c");
                else if(i==3)
                    send.putExtra("alphabet","d");
                else if(i==4)
                    send.putExtra("alphabet","e");
                else if(i==5)
                    send.putExtra("alphabet","f");
                else if(i==6)
                    send.putExtra("alphabet","g");
                else if(i==7)
                    send.putExtra("alphabet","h");
                else if(i==8)
                    send.putExtra("alphabet","i");
                else if(i==9)
                    send.putExtra("alphabet","j");
                else if(i==10)
                    send.putExtra("alphabet","k");
                else if(i==11)
                    send.putExtra("alphabet","l");
                else if(i==12)
                    send.putExtra("alphabet","m");
                else if(i==13)
                    send.putExtra("alphabet","n");
                else if(i==14)
                    send.putExtra("alphabet","o");
                else if(i==15)
                    send.putExtra("alphabet","p");
                else if(i==16)
                    send.putExtra("alphabet","q");
                else if(i==17)
                    send.putExtra("alphabet","r");
                else if(i==18)
                    send.putExtra("alphabet","s");
                else if(i==19)
                    send.putExtra("alphabet","t");
                else if(i==20)
                    send.putExtra("alphabet","u");
                else if(i==21)
                    send.putExtra("alphabet","v");
                else if(i==22)
                    send.putExtra("alphabet","w");
                else if(i==23)
                    send.putExtra("alphabet","x");
                else if(i==24)
                    send.putExtra("alphabet","y");
                else if(i==25)
                    send.putExtra("alphabet","z");
             startActivity(send);
            }
        });


    }
}