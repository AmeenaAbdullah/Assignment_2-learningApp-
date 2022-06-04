package com.example.lets_learn;

public class NumberList {
    public String Name;
    public String word;
    public int img;

    public
    NumberList(String name, int img,String w) {
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
