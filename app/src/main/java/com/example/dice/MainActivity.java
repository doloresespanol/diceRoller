package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<ImageView> kostki = new ArrayList<>();
    Button diceButton;
    ArrayList<Dice> rolledDices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kostki.add(findViewById(R.id.imageView0));
        kostki.add(findViewById(R.id.imageView1));
        kostki.add(findViewById(R.id.imageView2));
        kostki.add(findViewById(R.id.imageView3));
        kostki.add(findViewById(R.id.imageView4));

        losowanie();

        diceButton = findViewById(R.id.button);
        for (int i = 0; i < kostki.size(); i++) {
            int id = i;
            ImageView image = kostki.get(i);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(image.getImageAlpha()==50){
                        image.setImageAlpha(255);
                        rolledDices.get(id).setClicked(false);
                    }else{
                        image.setImageAlpha(50);
                        rolledDices.get(id).setClicked(true);
                    }
                }
            });
        }
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            losowanie();
            }
        });
    }
    private void losowanie(){
        if(rolledDices.size()==0){
            for(int i=0;i<5;i++){
                Dice dice = new Dice();
                rolledDices.add(dice);
                kostki.get(i).setImageResource(dice.getId_image());
            }
        }else{
            for (int i = 0; i < 5; i++) {
                Dice dice = rolledDices.get(i);
                if (dice.isClicked() == false) {
                    dice.setValue();
                    kostki.get(i).setImageResource(dice.getId_image());
                }
            }
        }
    }
}