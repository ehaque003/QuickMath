package com.example.quickmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class Results extends AppCompatActivity {
    TextView totalTime = findViewById(R.id.totalTime);
    TextView average = findViewById(R.id.average);
    TextView score = findViewById(R.id.score);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


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