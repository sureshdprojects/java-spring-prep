package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {
        System.out.println(leftRotateArrayByOnePlace(new int[]{1,2,3,4}));
        System.out.println(leftRotateArrayByOnePlace2(new int[]{1,2,3,4}));
    }

    //this method takes more assignments as it is based on swapping
    public static String leftRotateArrayByOnePlace(int[] numbers) {

        for (int i=1; i<numbers.length; i++){
            int temp = numbers[i-1];
            numbers[i-1] = numbers[i];
            numbers[i] = temp;
        }

        return Arrays.toString(numbers);

    }

    public static String leftRotateArrayByOnePlace2(int[] numbers) {

        int first = numbers[0];
        for (int i=1; i<numbers.length; i++){
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = first;

        return Arrays.toString(numbers);

    }


}
