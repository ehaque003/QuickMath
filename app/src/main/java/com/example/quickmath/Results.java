package com.example.quickmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        TextView TotalTimeText = findViewById(R.id.totalTime);
        TextView score = findViewById(R.id.score);
        TextView stars = findViewById(R.id.stars);
        Intent i = getIntent();
        String totaltime = i.getStringExtra("TimeTook");
        String correctness = i.getStringExtra("AnswerGotCorrect");
        score.setText("You score was " + correctness + "/10");
        TotalTimeText.setText("Your time was " + totaltime + " seconds");
        int performerscore = 100;
        if(!(correctness.equals("0"))){
            performerscore = (Math.round(Integer.parseInt(totaltime)/Integer.parseInt(correctness)));
        }
        if (performerscore < 5) {
            stars.setText("You earned 5 stars");
        } else if (5<=performerscore&&performerscore<=7){
            stars.setText("You earned 4 stars");
        } else if (8<=performerscore&&performerscore<=12){
            stars.setText("You earned 3 stars");
        } else if (13<=performerscore&&performerscore<=15){
            stars.setText("You earned 2 stars");
        } else {
            stars.setText("You earned 1 star");
        }
        Button Home = findViewById(R.id.back);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Results.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}