package com.example.quickmath;

import java.util.Random;

public class Problem {
    String equation;
    int firstNum;
    int secomdNum;
    int firstMediumNum;
    int secondMediumNum;
    int firstHardNum;
    int secondHardNum;
    int firstMediumSimpleNum;
    int secondMediumSimpleNum;
    int firstHardSimpleNum;
    int secondHardSimpleNum;
    int result;
    char op;
    char[] opArray = {'+', '-', '*', '/'};
    String level;
    public Problem(String Level){
        int multiplier = 1;
        level = "medium";
        if (Level.equalsIgnoreCase("easy")) {
            multiplier = 10;
            level = "easy";
        } else if (Level.equalsIgnoreCase("hard")) {
            multiplier = 100;
            level = "hard";
        }

        int limit = 10 * multiplier;
        int floor = multiplier;

        Random oprnd = new Random();
        firstNum = (int)Math.floor(Math.random()*(10 - 0 + 1) + 0);
        secomdNum = (int)Math.floor(Math.random()*(10 - 0 + 1) + 0);
        secondMediumNum = (int)Math.floor(Math.random()*(20 - 10 + 1) + 10);
        firstMediumNum = (int)Math.floor(Math.random()*(20 - 10 + 1) + 10);
        firstHardNum = (int)Math.floor(Math.random()*(100 - 30 + 1) + 30);
        secondHardNum = (int)Math.floor(Math.random()*(100 - 30 + 1) + 30);
        firstMediumSimpleNum = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10);
        secondMediumSimpleNum = (int)Math.floor(Math.random()*(100 - 10 + 1) + 10);
        firstHardSimpleNum = (int)Math.floor(Math.random()*(1000 - 100 + 1) + 100);
        secondHardSimpleNum = (int)Math.floor(Math.random()*(1000 - 10 + 1) + 100);
        op = opArray[oprnd.nextInt(3)];
        result = calcResult();
    }
    private int calcResult() {
        if(op=='+'){
            if(level == "easy"){
                result = firstNum + secomdNum;
            }else if(level == "medium"){
                result = firstMediumSimpleNum + secondMediumSimpleNum;
            }else if(level == "hard"){
                result = firstHardSimpleNum + secondHardSimpleNum;
            }
        } else if(op=='-'){
            if(level == "easy"){
                result = firstNum - secomdNum;
            }else if(level == "medium"){
                result = firstMediumSimpleNum - secondMediumSimpleNum;
            }else if(level == "hard"){
                result = firstHardSimpleNum - secondHardSimpleNum;
            }
        } else if(op=='*'){
            if(level == "easy") {
                result = firstNum * secomdNum;
            } else if(level == "medium"){
                result = firstMediumNum * secondMediumNum;
            } else if(level == "hard"){
                result = firstHardNum * secondHardNum;
            }
        } else if(op=='/'){
            if(!((firstNum/secomdNum)%1==0)){
                if(level == "easy"){
                    result = firstNum/secomdNum;
                }else if(level == "medium"){
                    result = firstMediumNum/secondMediumNum;
                }else if(level == "hard"){
                    result = firstHardNum/secondHardNum;
                }
            }
            else{
                if(level == "easy"){
                    result = firstNum*secomdNum;
                }else if(level == "medium"){
                    result = firstMediumNum*secondMediumNum;
                }else if(level == "hard"){
                    result = firstHardNum * secondHardNum;
                }
            }
        }
        return result;

    }

    public String getEquation() {
        if(op=='+'){
            if(level == "easy"){
                equation = firstNum+" + "+secomdNum;
            }else if(level == "medium"){
                equation = firstMediumSimpleNum+" + "+secondMediumSimpleNum;
            }else if(level == "hard"){
                equation = firstHardSimpleNum+" + "+secondHardSimpleNum;
            }
        } else if(op=='-'){
            if(level == "easy"){
                equation = firstNum+" - "+secomdNum;
            }else if(level == "medium"){
                equation = firstMediumSimpleNum+" - "+secondMediumSimpleNum;
            }else if(level == "hard"){
                equation = firstHardSimpleNum+" - "+secondHardSimpleNum;
            }
        } else if(op=='*'){
            if(level == "easy"){
                equation = firstNum+" * "+secomdNum;
            }else if(level == "medium"){
                equation = firstMediumNum + " * " + secondMediumNum;
            }else if(level == "hard"){
                equation = firstHardNum + " * " + secondHardNum;
            }

        } else if(op=='*') {
            if(!((firstNum/secomdNum)%1==0)){
                if(level == "easy"){
                    equation = firstNum+" / "+secomdNum;
                }else if(level == "medium"){
                    equation = firstMediumNum+" / "+secondMediumNum;
                }else if(level == "hard"){
                    equation = firstHardNum+" / "+secondHardNum;
                }

            }
            else{
                if(level == "easy"){
                    equation = firstNum+" * "+secomdNum;
                }else if(level == "medium"){
                    equation = firstMediumNum + " * " + secondMediumNum;
                }else if(level == "hard"){
                    equation = firstHardNum + " * " + secondHardNum;
                }
            }
        }
        return equation;
    }

    public int getResult() {
        return result;
    }

}
