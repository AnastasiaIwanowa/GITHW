package com.epam.anastasiya_ivanova.java.lesson1.task1;

import java.util.*;

/**
 * Anastasiya Ivanova. Option 6.
 */
public class ArrayProcessing {

    /**
     * generate an array with given boundaries
     *
     * @param array array
     * @param left  left border
     * @param right right border
     * @return generated array
     */
    public int[] generateArray(int[] array, int left, int right) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (right - left + 2) + left - 1);
        }
        return array;
    }

    public void outArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * pick items at odd positions
     *
     * @param array input array
     * @return array of elements in odd positions
     */
    public int[] createArrayElementsIndicesOdd(int[] array) {
        int[] arrayOdd = new int[array.length / 2];
        for (int i = 0; i < array.length; i += 2) {
            arrayOdd[i / 2] = array[i];
        }
        return arrayOdd;
    }

    /**
     * fill the array with the same number
     *
     * @param k lenght array
     * @return filled array
     */
    public int[] fillArray(int k) {
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = Application.COUNT + 1;
        }
        return array;
    }

    /**
     * create an array of duplicate elements
     *
     * @param array source array
     * @param k     new array length
     * @return recurring array
     */
    public int[] createArrayDuplicateElements(int[] array, int k) {
        int[] newArr = new int[k];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != Application.COUNT + 1 && !isArrayContainElement(array[j], newArr)) {
                    newArr[i] = array[j];
                    break;
                }
            }
        }
        return newArr;
    }

    /**
     * create an array of elements that occur more than once
     *
     * @param array input array
     * @return array of elements that occur more than once
     */
    public int[] createArrayElementsOccurringMoreThanOnce(int[] array) {
        int[] arr = fillArray(array.length);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] == array[j] && !isArrayContainElement(array[i], arr)) {
                    arr[i] = array[i];
                    k++;
                }
            }
        }
        return createArrayDuplicateElements(arr, k);
    }

    /**
     * check if an element is contained in an array
     *
     * @param el  checked item
     * @param arr array
     * @return true if the element is contained in an array
     */
    public boolean isArrayContainElement(int el, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el)
                return true;
        }
        return false;
    }

}
