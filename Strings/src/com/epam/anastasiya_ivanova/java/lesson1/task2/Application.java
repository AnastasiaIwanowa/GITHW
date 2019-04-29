package com.epam.anastasiya_ivanova.java.lesson1.task2;

import java.util.Scanner;

/**
 * Anastasiya Ivanova. Option 6.
 */
public class Application {

    public void startApplication() {
        System.out.println("Input string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str.trim();
        StringProcessing sp = new StringProcessing();
        sp.outWordFromDigit(sp.createArrayBoolean(sp.createArrayStrings(str)), sp.createArrayStrings(str));
    }

}
