package com.example.dice;

public class Dice {
    private int value;
    private int id_image;
    private boolean isClicked;

    public Dice() {
        this.value = (int)(Math.random()*6+1);
        this.isClicked = false;

    }
}



