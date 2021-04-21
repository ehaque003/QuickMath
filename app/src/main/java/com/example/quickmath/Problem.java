package com.example.quickmath;

import java.util.Random;

public class Problem {
    String equation;
    int firstNum;
    int secomdNum;
    int result;
    char op;
    char[] opArray = {'+', '-', '*', '/'};
    public Problem(String level){
        int multiplier = 1;
        if (level.equalsIgnoreCase("medium")) {
            multiplier = 10;
        } else if (level.equalsIgnoreCase("hard")) {
            multiplier = 100;
        }

        int limit = 10 * multiplier;

        Random rnd = new Random();
        Random rnd2 = new Random();
        Random oprnd = new Random();
        firstNum = rnd.nextInt(limit);
        secomdNum = rnd2.nextInt(limit);
        op = opArray[oprnd.nextInt(3)];
        result = calcResult();
    }
    private int calcResult() {
        if(op=='+'){
            result=firstNum+secomdNum;
        } else if(op=='-'){
            result=firstNum-secomdNum;
        } else if(op=='*'){
            result=firstNum*secomdNum;
        } else if(op=='/'){
            if(!((firstNum/secomdNum)%1==0)){
                result = firstNum/secomdNum;
            }
            else{
                result = firstNum*secomdNum;
            }
        }
        return result;

    }

    public String getEquation() {
        if(op=='+'){
            equation = firstNum+" + "+secomdNum;
        } else if(op=='-'){
            equation = firstNum+" - "+secomdNum;
        } else if(op=='*'){
            equation = firstNum+" * "+secomdNum;
        } else if(op=='*') {
            if(!((firstNum/secomdNum)%1==0)){
                equation = firstNum+" / "+secomdNum;
            }
            else{
                equation = firstNum+" * "+secomdNum;
            }
        }
        return equation;
    }

    public int getResult() {
        return result;
    }

}
