package com.epam.anastasiya_ivanova.java.lesson1.task2;

public class StringProcessing {

    public boolean isNumbers(String s){
        s.trim();
        int k=0;
        for (int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                k++;
            }
        }
        return k==s.length();
    }
}
