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
    int answergotcorrect = 0;
    int questionsanswered = 0;
    long starttime;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = getIntent();
            String difficultylevel = intent.getStringExtra("Difficulty_level");
            Problem problem = new Problem(difficultylevel);
            equation.setText(problem.getEquation());
            answer.setText("");
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        int userinput = Integer.parseInt(answer.getText()+"");
                        int correctanswer = problem.getResult();
                        if(userinput==correctanswer){
                            Toast.makeText(getApplicationContext(), "You got correct.", Toast.LENGTH_LONG).show();
                            ++answergotcorrect;
                            if(questionsanswered<9){
                                ++questionsanswered;
                                Handler handler = new Handler();
                                handler.post(runnable);
                            }
                            else{
                                Intent intent1 = new Intent(Questions.this, Results.class);
                                intent1.putExtra("AnswerGotCorrect", answergotcorrect+"");
                                intent1.putExtra("TimeTook", ((System.currentTimeMillis()-starttime)/1000)+"");
                                startActivity(intent1);
                            }

                        }
                        else{
                            Toast.makeText(getApplicationContext(), "You got incorrect.", Toast.LENGTH_LONG).show();
                            if(questionsanswered<9){
                                ++questionsanswered;
                                Handler handler = new Handler();
                                handler.post(runnable);
                            }
                            else{
                                Intent intent1 = new Intent(Questions.this, Results.class);
                                intent1.putExtra("AnswerGotCorrect", answergotcorrect+"");
                                intent1.putExtra("TimeTook", ((System.currentTimeMillis()-starttime)/1000)+"");
                                startActivity(intent1);
                            }
                        }
                    } catch (NumberFormatException numberFormatException){
                        Toast.makeText(getApplicationContext(), "You submitted something else than a number. Please input a number.", Toast.LENGTH_LONG).show();
                    }
                }
            });

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
                starttime = System.currentTimeMillis();
                Handler handler = new Handler();
                handler.post(runnable);

            }
        });

    }
}