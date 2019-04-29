package com.epam.anastasiya_ivanova.java.lesson1.task3;

import java.util.Scanner;

/**
 * Anastasiya Ivanova. Option 6.
 */
public class Application {

    public void calc() {
        int a, b, result;
        String continuation;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter operation: ");
            System.out.println("+ - addition ");
            System.out.println("- - subtraction ");
            System.out.println("* - multiplication ");
            System.out.println("/ - division ");
            String opertaion = in.next();
            System.out.println("Your operation is: " + opertaion);
            System.out.println("Enter 1 integer number: ");
            a = in.nextInt();
            System.out.println("Your 1 number is: " + a);
            System.out.println("Enter 2 integer number: ");
            b = in.nextInt();
            System.out.println("Your 2 number is: " + b);
            MathematicalOperations mo = new MathematicalOperations();
            switch (opertaion) {
                case "+":
                    result = mo.add(a, b);
                    System.out.println("Result = " + result);
                    break;
                case "-":
                    result = mo.sub(a, b);
                    System.out.println("Result = " + result);
                    break;
                case "*":
                    result = mo.mult(a, b);
                    System.out.println("Result = " + result);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Division by zero!");
                    } else {
                        result = mo.div(a, b);
                        System.out.println("Result = " + result);
                    }
                    break;

                default:
                    System.out.println("No operation selected");
            }
            System.out.println("Enter to continue 'y' ");
            continuation = in.next().trim();
        } while (continuation.equalsIgnoreCase("y"));
    }
}
