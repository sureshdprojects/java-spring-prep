package com.lifeisjoy.java_spring_prep.dsa.arrays.easy;

public class MaximumNumberOfConsecutiveOnes {

    /*
        Given a binary array nums, return the maximum number of consecutive 1s in the array.
    */
    public static void main(String[] args) {
        System.out.println(maximumNumberOfConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 0, 0,1,1,1,1,1}));
        System.out.println(maximumNumberOfConsecutiveOnes2(new int[]{1, 1, 0, 0, 1, 1, 0, 0,1,1,1,1,1}));
    }

    public static int maximumNumberOfConsecutiveOnes(int[] numbers) {

        int maxCount = 0;
        int count = 0;
        for (int number : numbers) {

            if (number == 1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else {
                count = 0;
            }

        }
        return maxCount;

    }

    //for practicing again
    public static int maximumNumberOfConsecutiveOnes2(int[] numbers) {

        System.out.println("practice code!");

        int maxCount = 0;
        int count = 0;
        for (int num: numbers){

            if (num == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }

        }

        return maxCount;

    }

}
