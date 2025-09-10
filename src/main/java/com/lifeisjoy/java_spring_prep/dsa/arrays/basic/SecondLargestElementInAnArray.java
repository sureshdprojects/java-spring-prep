package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

public class SecondLargestElementInAnArray {

    public static void main(String[] args) throws Exception {
        System.out.println(secondLargestElement(new int[]{2,1,0}));
        System.out.println(secondLargest2(new int[]{123,56,222}));
    }

    public static int secondLargestElement(int[] numbers) throws Exception {

        if (numbers == null || numbers.length < 2)
            throw new Exception("Either array is null or size is less than 2");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;

    }

    public static int secondLargest2(int[] numbers){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num: numbers){

            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }

        }

        return secondLargest;

    }

}
