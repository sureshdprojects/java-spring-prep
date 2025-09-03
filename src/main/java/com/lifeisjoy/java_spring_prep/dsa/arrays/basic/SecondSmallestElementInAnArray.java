package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

public class SecondSmallestElementInAnArray {

    public static void main(String[] args) {
        System.out.println(secondSmallest(new int[]{1,2,3,4,5}));
        System.out.println(secondSmallest(new int[]{-1,-2,-3}));
    }

    public static int secondSmallest(int[] numbers){

        int smallest = numbers[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < smallest){
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest){
                secondSmallest = numbers[i];
            }
        }

        return secondSmallest;

    }

}
