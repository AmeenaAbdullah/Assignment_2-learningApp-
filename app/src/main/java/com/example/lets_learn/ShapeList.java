package com.example.lets_learn;

import android.widget.ArrayAdapter;

public class ShapeList  {
    public int img;
    public String name;

    public ShapeList(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
