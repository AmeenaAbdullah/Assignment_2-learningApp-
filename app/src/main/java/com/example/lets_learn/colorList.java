package com.example.lets_learn;

public class colorList {
    public String ColorName;
    public int Color;
    public int textcolor;

    public colorList(int text,String colorName, int color) {
        ColorName = colorName;
        Color = color;
        textcolor=text;
    }

    public String getColorName() {
        return ColorName;
    }

    public int getTextcolor() {
        return textcolor;
    }

    public int getColor() {
        return Color;
    }
}
