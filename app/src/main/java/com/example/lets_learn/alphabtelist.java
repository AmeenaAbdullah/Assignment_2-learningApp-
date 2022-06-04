package com.example.lets_learn;

import java.security.PublicKey;

public class alphabtelist {
    public String Name;
    public String word;
    public int img;

    public
    alphabtelist(String name, int img,String w) {
        Name = name;
        this.img = img;
        word=w;
    }

    public String getWord() {
        return word;
    }

    public String getName() {
        return Name;
    }

    public int getImg() {
        return img;
    }

}
