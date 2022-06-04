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
                    t.setText("J");
                else if(i==10)
                    t.setText("K");
                else if(i==11)
                    t.setText("L");
                else if(i==12)
                    t.setText("N");
                else if(i==13)
                    t.setText("O");
                else if(i==14)
                    t.setText("P");
                else if(i==15)
                    t.setText("Q");
                else if(i==16)
                    t.setText("R");
                else if(i==17)
                    t.setText("S");
                else if(i==18)
                    t.setText("T");
                else if(i==19)
                    t.setText("U");
                else if(i==20)
                    t.setText("V");
                else if(i==21)
                    t.setText("W");
                else if(i==22)
                    t.setText("X");
                else if(i==23)
                    t.setText("y");
                else if(i==24)
                    t.setText("Z");
            }
        });

        public void clicked(View v) {
            Intent send = new Intent(aphabets.this, Alphabets.class);
            switch(v.getId())
            {
                case R.id.a:{
                    send.putExtra("alphabet","a");
                    startActivity(send);
                    break;
                }
                case R.id.b:{

                    startActivity(send);
                    break;
                }
                case R.id.c:{
                    send.putExtra("alphabet","c");
                    startActivity(send);
                    break;
                }
                case R.id.d:{

                    startActivity(send);
                    break;
                }
                case R.id.e:{
                    send.putExtra("alphabet","e");
                    startActivity(send);
                    break;
                }
                case R.id.f:{
                    send.putExtra("alphabet","f");
                    startActivity(send);
                    break;
                }
                case R.id.g:{
                    send.putExtra("alphabet","g");
                    startActivity(send);
                    break;
                }
                case R.id.h:{
                    send.putExtra("alphabet","h");
                    startActivity(send);
                    break;
                }
                case R.id.i:{
                    send.putExtra("alphabet","i");
                    startActivity(send);
                    break;
                }
                case R.id.j:{
                    send.putExtra("alphabet","j");
                    startActivity(send);
                    break;
                }
                case R.id.k:{
                    send.putExtra("alphabet","k");
                    startActivity(send);
                    break;
                }
                case R.id.l:{
                    send.putExtra("alphabet","l");
                    startActivity(send);
                    break;
                }
                case R.id.m:{
                    send.putExtra("alphabet","m");
                    startActivity(send);
                    break;
                }
                case R.id.n:{
                    send.putExtra("alphabet","n");
                    startActivity(send);
                    break;
                }
                case R.id.o:{
                    send.putExtra("alphabet","o");
                    startActivity(send);
                    break;
                }
                case R.id.p:{
                    send.putExtra("alphabet","p");
                    startActivity(send);
                    break;
                }case R.id.q:{
                send.putExtra("alphabet","q");
                startActivity(send);
                break;
            }
                case R.id.r:{
                    send.putExtra("alphabet","r");
                    startActivity(send);
                    break;
                }
                case R.id.s:{
                    send.putExtra("alphabet","s");
                    startActivity(send);
                    break;
                }
                case R.id.t:{
                    send.putExtra("alphabet","t");
                    startActivity(send);
                    break;
                }
                case R.id.u:{
                    send.putExtra("alphabet","u");
                    startActivity(send);
                    break;
                }
                case R.id.v:{
                    send.putExtra("alphabet","v");
                    startActivity(send);
                    break;
                }
                case R.id.w:{
                    send.putExtra("alphabet","w");
                    startActivity(send);
                    break;
                }
                case R.id.x:{
                    send.putExtra("alphabet","x");
                    startActivity(send);
                    break;
                }
                case R.id.y:{
                    send.putExtra("alphabet","y");
                    startActivity(send);
                    break;
                }
                case R.id.z:{
                    send.putExtra("alphabet","z");
                    startActivity(send);
                    break;
                }

            }


        }
    }
}