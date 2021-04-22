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
    TextView answer;
    String userinputstring = "0";
    boolean notanswered = true;
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
            answer.setText("0");
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int userinput = Integer.parseInt(userinputstring);
                    int correctanswer = problem.getResult();
                    notanswered = true;
                    userinputstring = "0";
                    if(userinput==correctanswer){
                        Toast.makeText(getApplicationContext(), "You got this question correct", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(getApplicationContext(), "You got this question incorrect", Toast.LENGTH_SHORT).show();
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
                }
            });

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        submit = findViewById(R.id.submit);
        answer = findViewById(R.id.answer);
        equation = findViewById(R.id.problem);
        Button backspace = findViewById(R.id.backspace);
        Button negativesign = findViewById(R.id.negativesign);
        Button a0 = findViewById(R.id.a0);
        Button a1 = findViewById(R.id.a1);
        Button a2 = findViewById(R.id.a);
        Button a3 = findViewById(R.id.a2);
        Button a4 = findViewById(R.id.a3);
        Button a5 = findViewById(R.id.a4);
        Button a6 = findViewById(R.id.a5);
        Button a7 = findViewById(R.id.a6);
        Button a8 = findViewById(R.id.a7);
        Button a9 = findViewById(R.id.a8);
        Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                backspace.setVisibility(View.VISIBLE);
                negativesign.setVisibility(View.VISIBLE);
                a0.setVisibility(View.VISIBLE);
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                a5.setVisibility(View.VISIBLE);
                a6.setVisibility(View.VISIBLE);
                a7.setVisibility(View.VISIBLE);
                a8.setVisibility(View.VISIBLE);
                a9.setVisibility(View.VISIBLE);
                starttime = System.currentTimeMillis();
                Handler handler = new Handler();
                handler.post(runnable);

            }
        });
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    Toast.makeText(getApplicationContext(), "Zero is clicked", Toast.LENGTH_SHORT).show();
                    userinputstring = "0";
                    answer.setText(userinputstring);
                }
                else{
                    userinputstring = userinputstring+"0";
                    answer.setText(userinputstring);
                }
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "1";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"1";
                    answer.setText(userinputstring);
                }
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "2";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"2";
                    answer.setText(userinputstring);
                }
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "3";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"3";
                    answer.setText(userinputstring);
                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "4";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"4";
                    answer.setText(userinputstring);
                }
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "5";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"5";
                    answer.setText(userinputstring);
                }
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "6";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"6";
                    answer.setText(userinputstring);
                }
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "7";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"7";
                    answer.setText(userinputstring);
                }
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "8";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"8";
                    answer.setText(userinputstring);
                }
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "9";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = userinputstring+"9";
                    answer.setText(userinputstring);
                }
            }
        });
        negativesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notanswered){
                    userinputstring = "-";
                    answer.setText(userinputstring);
                    notanswered = false;
                }
                else{
                    userinputstring = "-"+userinputstring;
                    answer.setText(userinputstring);
                }
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!notanswered){
                    if(userinputstring.length()==1){
                        userinputstring = "0";
                        notanswered = true;
                        answer.setText(userinputstring);
                    }
                    else{
                        userinputstring=userinputstring.substring(0, userinputstring.length()-1);
                        answer.setText(userinputstring);
                    }
                }
            }
        });




    }
}