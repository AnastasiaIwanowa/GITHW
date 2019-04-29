package com.epam.anastasiya_ivanova.java.lesson1.task1;

/**
 * Anastasiya Ivanova. Option 6.
 */
public class Application {
    public static final int COUNT = 20;

    public void startApplication() {
        int[] array = new int[COUNT];
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        System.out.println("Source array: ");
        arrayProcessing.outArray(arrayProcessing.generateArray(array, -10, 10));
        System.out.println("Final array: ");
        arrayProcessing.outArray(arrayProcessing.createArrayElementsOccurringMoreThanOnce(arrayProcessing.createArrayElementsIndicesOdd(array)));
    }

}
