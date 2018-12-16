package com.techyrh.sourabhupreti.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView myimg;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myimg = findViewById(R.id.imageView);
        myimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
                
            }
        });
    }
    private void rolldice(){
        int rand=random.nextInt(6)+1;
        switch(rand){
            case 1 :
                myimg.setImageResource(R.drawable.dice1);
                break;
            case 2 :
                myimg.setImageResource(R.drawable.dice2);
                break;
            case 3 :
                myimg.setImageResource(R.drawable.dice3);
                break;
            case 4:
                myimg.setImageResource(R.drawable.dice4);
                break;
            case 5 :
                myimg.setImageResource(R.drawable.dice5);
                break;
            case 6:
                myimg.setImageResource(R.drawable.dice6);
                break;
        }
    }

}
