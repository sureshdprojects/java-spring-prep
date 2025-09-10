package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {
        System.out.println(leftRotateArrayByOnePlace(new int[]{1,2,3,4}));
    }

    public static String leftRotateArrayByOnePlace(int[] numbers) {

        int first = numbers[0];
        for (int i=1; i<numbers.length; i++){
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = first;

        return Arrays.toString(numbers);

    }


}
