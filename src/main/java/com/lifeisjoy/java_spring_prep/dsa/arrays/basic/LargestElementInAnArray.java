package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestElementInAnArray {

    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{1, 6, 3, 4, 5}));
        System.out.println(largestElementUsingStreams(new int[]{1, 6, 3, 4, 5}));

    }

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(max < nums[i]) max = nums[i];
        }
        return max;
    }

    public static int largestElementUsingStreams(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(0);
    }

}
