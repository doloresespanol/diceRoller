package com.example.dice;

import java.util.ArrayList;

public class Dice {
    private int value;
    private int id_image;
    private boolean isClicked;
    private ArrayList<Integer> allImages = new ArrayList<>();

    public Dice() {
        imageArray();
        this.value = (int)(Math.random()*6+1);
        this.isClicked = false;
        this.id_image = allImages.get(value-1);
    }
    private void imageArray(){
        allImages.add(R.drawable.dice_1);
        allImages.add(R.drawable.dice_2);
        allImages.add(R.drawable.dice_3);
        allImages.add(R.drawable.dice_4);
        allImages.add(R.drawable.dice_5);
        allImages.add(R.drawable.dice_6);

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }
}



