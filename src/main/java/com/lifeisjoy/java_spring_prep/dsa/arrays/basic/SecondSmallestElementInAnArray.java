package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

public class SecondSmallestElementInAnArray {

    public static void main(String[] args) {
        System.out.println(secondSmallest(new int[]{1,2,3,4,5}));
        System.out.println(secondSmallest(new int[]{-1,-2,-3,-4}));
    }

    public static int secondSmallest(int[] numbers){

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number: numbers){
            if (number < smallest){
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest){
                secondSmallest = number;
            }
        }

        return secondSmallest;

    }

}
