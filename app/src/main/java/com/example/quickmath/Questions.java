package com.example.quickmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class Questions extends AppCompatActivity {
    Button submit;
    TextView equation;
    EditText answer;
    boolean isNotClicked = true;
    int answergotcorrect = 0;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = getIntent();
            String difficultylevel = intent.getStringExtra("Difficulty_level");
            long starttime = System.currentTimeMillis();
            for(int i = 0; i<=10; ++i){
                Problem problem = new Problem(difficultylevel);
                equation.setText(problem.getEquation());
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int userinput = Integer.parseInt(answer.getText()+"");
                        int correctanswer = problem.getResult();
                        if(userinput==correctanswer){
                            Toast.makeText(getApplicationContext(), "You got correct.", Toast.LENGTH_LONG).show();
                            ++answergotcorrect;
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "You got incorrect.", Toast.LENGTH_LONG).show();
                        }
                        isNotClicked = false;
                    }
                });


            }
            String elaspetime = (System.currentTimeMillis()-starttime)+"";
//            Intent intent1 = new Intent(Questions.this, Results.class);
//            intent1.putExtra("Timetook", elaspetime);
//            intent1.putExtra("GotCorrectNum", answergotcorrect+"");
//            startActivity(intent1);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        submit = findViewById(R.id.submitbutton);
        answer = findViewById(R.id.answerbutton);
        equation = findViewById(R.id.problem);
        Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.post(runnable);
            }
        });

    }
}