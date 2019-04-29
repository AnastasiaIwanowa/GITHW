package com.epam.anastasiya_ivanova.java.lesson1.task2;

/**
 * Anastasiya Ivanova. Option 6.
 */
public class StringProcessing {

    /**
     * method checking that the input string consists of only numbers
     *
     * @param s input string
     * @return true if the string consists only of numbers, otherwise it is false
     */
    public boolean isNumbers(String s) {
        s.trim();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                k++;
            }
        }
        return k == s.length();
    }

    /**
     * create an array of words, split the line by space
     *
     * @param s input string
     * @return array of words
     */
    public String[] createArrayStrings(String s) {
        String[] str = s.split(" ");
        return str;
    }

    /**
     * convert an array of words into a logical array, where the true - the word consists of numbers
     *
     * @param s input array strings
     * @return boolean array
     */
    public boolean[] createArrayBoolean(String[] s) {
        boolean[] b = new boolean[s.length];
        for (int i = 0; i < s.length; i++) {
            if (isNumbers(s[i])) b[i] = true;
        }
        return b;
    }

    /**
     * find the second word consisting of numbers in the array
     *
     * @param b boolean array
     */
    public void findSecondWord(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == true) {
                b[i] = false;
                return;
            }
        }
    }

    /**
     * displays a word from numbers if it is or the second word if there are several
     *
     * @param b boolean array
     * @param s array words
     */
    public void outWordFromDigit(boolean[] b, String[] s) {
        int k = 0;
        for (boolean i : b) {
            if (i == true) k++;
        }
        switch (k) {
            case (0):
                System.out.println("No words only numbers");
                break;
            case (1):
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == true)
                        System.out.println(s[i]);
                }
                break;
            default:
                findSecondWord(b);
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == true) {
                        System.out.println(s[i]);
                        break;
                    } else continue;
                }
                break;

        }
    }
}
