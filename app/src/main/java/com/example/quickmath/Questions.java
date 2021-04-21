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
    Runnable easy = new Runnable() {
        @Override
        public void run() {
            Random firstnum = new Random();
            Random secondnum = new Random();
            Random operator = new Random();
            int i = 0;
            long time = System.currentTimeMillis();
            while(i<=10){
                int firstnums = firstnum.nextInt(10);
                int secondnums = secondnum.nextInt(10);
                int operators = operator.nextInt(3)+1;
                switch (operators){
                    case 1:
                        int sum = firstnums+secondnums;
                        String firstnumss = firstnums+"";
                        String secondnumss = secondnums+"";
                        equation.setText(firstnumss+" + "+secondnumss);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==sum){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 2:
                        int difference = firstnums-secondnums;
                        String firstnumss2 = firstnums+"";
                        String secondnumss2 = secondnums+"";
                        equation.setText(firstnumss2+" - "+secondnumss2);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==difference){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 3:
                        int product = firstnums*secondnums;
                        String firstnumss3 = firstnums+"";
                        String secondnumss3 = secondnums+"";
                        equation.setText(firstnumss3+" * "+secondnumss3);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==product){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 4:
                        int quotient = firstnums/secondnums;
                        if(!(quotient%1==0)){
                            --i;
                            break;
                        }
                        String firstnumss4 = firstnums+"";
                        String secondnumss4 = secondnums+"";
                        equation.setText(firstnumss4+" / "+secondnumss4);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==quotient){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;


                }
                ++i;

            }
            long endtime = System.currentTimeMillis();
            int elaspetime = ((int)(time-endtime))/1000;
        }
    };

    Runnable medium = new Runnable() {
        @Override
        public void run() {
            Random firstnum = new Random();
            Random secondnum = new Random();
            Random operator = new Random();
            int i = 0;
            long time = System.currentTimeMillis();
            while(i<=10){
                int firstnums = firstnum.nextInt(100);
                int secondnums = secondnum.nextInt(100);
                int operators = operator.nextInt(3)+1;
                switch (operators){
                    case 1:
                        int sum = firstnums+secondnums;
                        String firstnumss = firstnums+"";
                        String secondnumss = secondnums+"";
                        equation.setText(firstnumss+" + "+secondnumss);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==sum){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 2:
                        int difference = firstnums-secondnums;
                        String firstnumss2 = firstnums+"";
                        String secondnumss2 = secondnums+"";
                        equation.setText(firstnumss2+" - "+secondnumss2);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==difference){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 3:
                        int product = firstnums*secondnums;
                        String firstnumss3 = firstnums+"";
                        String secondnumss3 = secondnums+"";
                        equation.setText(firstnumss3+" * "+secondnumss3);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==product){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 4:
                        int quotient = firstnums/secondnums;
                        if(!(quotient%1==0)){
                            --i;
                            break;
                        }
                        String firstnumss4 = firstnums+"";
                        String secondnumss4 = secondnums+"";
                        equation.setText(firstnumss4+" / "+secondnumss4);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==quotient){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;


                }
                ++i;

            }
            long endtime = System.currentTimeMillis();
            int elaspetime = ((int)(time-endtime))/1000;
        }
    };

    Runnable hard = new Runnable() {
        @Override
        public void run() {
            Random firstnum = new Random();
            Random secondnum = new Random();
            Random operator = new Random();
            int i = 0;
            long time = System.currentTimeMillis();
            while(i<=10){
                int firstnums = firstnum.nextInt(1000);
                int secondnums = secondnum.nextInt(1000);
                int operators = operator.nextInt(3)+1;
                switch (operators){
                    case 1:
                        int sum = firstnums+secondnums;
                        String firstnumss = firstnums+"";
                        String secondnumss = secondnums+"";
                        equation.setText(firstnumss+" + "+secondnumss);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==sum){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 2:
                        int difference = firstnums-secondnums;
                        String firstnumss2 = firstnums+"";
                        String secondnumss2 = secondnums+"";
                        equation.setText(firstnumss2+" - "+secondnumss2);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==difference){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 3:
                        int product = firstnums*secondnums;
                        String firstnumss3 = firstnums+"";
                        String secondnumss3 = secondnums+"";
                        equation.setText(firstnumss3+" * "+secondnumss3);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==product){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;

                    case 4:
                        int quotient = firstnums/secondnums;
                        if(!(quotient%1==0)){
                            --i;
                            break;
                        }
                        String firstnumss4 = firstnums+"";
                        String secondnumss4 = secondnums+"";
                        equation.setText(firstnumss4+" / "+secondnumss4);
                        submit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                int answers = Integer.parseInt(answer.getText().toString());
                                if(answers==quotient){
                                    Toast.makeText(getApplicationContext(), "You got it correct", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(getApplicationContext(), "You got it incorrect", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        break;


                }
                ++i;

            }
            long endtime = System.currentTimeMillis();
            int elaspetime = ((int)(time-endtime))/1000;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Intent intent = getIntent();
        String difficultylevel = intent.getStringExtra("Difficulty_level");
        submit = findViewById(R.id.submitbutton);
        answer = findViewById(R.id.answerbutton);
        equation = findViewById(R.id.problem);
        Handler handler = new Handler();
        handler.post(hard);
//        if(difficultylevel == "easy"){
//            Handler easys = new Handler();
//            easys.post(easy);
//        }
//        else if(difficultylevel == "medium"){
//            Handler mediums = new Handler();
//            mediums.post(medium);
//        }
    }
}