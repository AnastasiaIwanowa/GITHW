package com.epam.anastasiya_ivanova.java.lesson1.task3;

public class MathematicalOperations {

    public int add (int x, int y){
        return x+y;
    }

    public int sub (int x, int y){
        return x-y;
    }

    public int mult (int x, int y){
        return x*y;
    }

    public  int div (int x, int y){
        if (y==0) {
            System.out.println("division by zero!");
            return 0;
        } else
        return x/y;
    }

}
