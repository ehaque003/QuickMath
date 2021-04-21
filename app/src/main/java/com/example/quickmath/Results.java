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
        TextView AverageText = findViewById(R.id.average);
        TextView score = findViewById(R.id.score);
        Intent i = getIntent();
        String totaltime = i.getStringExtra("TimeTook");
        String correctness = i.getStringExtra("AnswerGotCorrect");

        score.setText("You score was: " + correctness + " /10");

        float totalTime = Integer.parseInt(totaltime);
        float Average = totalTime/10;
        String average = String.valueOf(Average);

        TotalTimeText.setText("Your time was: " + totaltime + " seconds");
        AverageText.setText("Your average time was: " + average + " seconds");


        Button b = findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Results.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}