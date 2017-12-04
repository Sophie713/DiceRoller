package com.example.sophie.diceroller;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



     public void roll (View view){

         ImageView dice1 = findViewById(R.id.dice);

         double randomNumber = Math.random();
         randomNumber = randomNumber*6;
         randomNumber = randomNumber+1;
         int number = (int) randomNumber;

         if(number == 1){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number1));
         }
         else if(number == 2){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number2));
         }
         else if(number == 3){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number3));
         }
         else if(number == 4){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number4));
         }
         else if(number == 5){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number5));
         }
         else if(number == 6){
             dice1.setImageDrawable(getResources().getDrawable(R.drawable.number6));
         }

         Toast toast= Toast.makeText(getApplicationContext(),
                 "Done", Toast.LENGTH_SHORT);
         toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 20);
         toast.show();

         MediaPlayer mp = MediaPlayer.create(this, R.raw.roll);
         mp.start();
     }

}
