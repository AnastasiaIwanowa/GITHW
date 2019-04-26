package com.epam.anastasiya_ivanova.java.lesson1.task1;
import java.util.*;

public class ArrayProcessing {

    public int[] generateArray(int[] array, int left, int right){

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*(right-left+2)+left-1);
        }
        return array;
    }

    public void outArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void outArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public int[] createArrayElementsIndicesOdd(int[] array){
        int[] arrayOdd = new int[array.length/2];
        for (int i=0; i<array.length; i+=2) {
            arrayOdd[i/2]=array[i];
        }
        return arrayOdd;
    }

    public int[] createArrayElementsOccurringMoreThanOnce(int[] array){
        HashSet<Integer> repeatingNumbers = new HashSet<Integer>();
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (i==j) continue;
                if (array[i]==array[j]){
                    repeatingNumbers.add(array[i]);
                    break;
                }
            }
        }
        return toInt(repeatingNumbers);
    }

    public int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }

    public int[][] createArrayElementsOccurringMoreThanOnce1(int[] array){
        int[][] valuesAndCount = new int[2][array.length];
        int k;
        for (int i=0; i<array.length; i++){
            k=0;
            for (int j=0; j<array.length; j++){
                if (array[i]==array[j]){
                    k++;
                    valuesAndCount[0][i]=array[j];
                    //valuesAndCount[1][i]=j;
                }
                valuesAndCount[1][i]=k;
            }
        }
        return valuesAndCount;
    }

    public int[] createArray(int[][] arr){
        int[] mas = new int[arr[0].length];
        for (int i=0; i<arr[0].length; i++){
            if (arr[1][i]>1 && !isArrayContainElement(arr[0][i], mas)){
                mas[i]=arr[0][i];
            }
        }
        return mas;
    }

    public boolean isArrayContainElement(int el, int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==el)
                return true;
        }
        return false;
    }
}
