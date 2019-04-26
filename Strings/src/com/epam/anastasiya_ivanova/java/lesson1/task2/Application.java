package com.epam.anastasiya_ivanova.java.lesson1.task2;

import java.util.Scanner;

public class Application {

    public void startApplication(){
        System.out.println("Input string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str.trim();
        StringProcessing sp = new StringProcessing();
        for (String retval : str.split(" ")) {
            System.out.println(retval);
            System.out.println(sp.isNumbers(retval));
        }
    }

}
