package com.epam.anastasiya_ivanova.java.lesson1.task1;

public class Application {
    public static final int COUNT = 20;

    public void startApplication() {
        int[] array = new int[COUNT];
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        System.out.println("Source array: ");
        arrayProcessing.outArray(arrayProcessing.generateArray(array, -10,10));
        System.out.println("Odd array: ");
        arrayProcessing.outArray(arrayProcessing.createArrayElementsIndicesOdd(array));
        System.out.println("Array with count: ");
        arrayProcessing.outArray1(arrayProcessing.createArrayElementsOccurringMoreThanOnce1(arrayProcessing.createArrayElementsIndicesOdd(array)));
        System.out.println("Final array: ");
        arrayProcessing.outArray(arrayProcessing.createArray(arrayProcessing.createArrayElementsOccurringMoreThanOnce1(arrayProcessing.createArrayElementsIndicesOdd(array))));
    }

}
