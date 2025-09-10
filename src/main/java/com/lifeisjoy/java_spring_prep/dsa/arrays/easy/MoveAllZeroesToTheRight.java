package com.lifeisjoy.java_spring_prep.dsa.arrays.easy;

import java.util.Arrays;

public class MoveAllZeroesToTheRight {

    /*
        Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same. This must be done in place, without making a copy of the array.
    */
    public static void main(String[] args) {

        int[] numbers = new int[]{0, 1, 4, 0, 5, 0, 2};
        moveAllZeroesToRight(numbers);
        moveAllZeroesToRight2(numbers);

    }

    private static void moveAllZeroesToRight(int[] numbers) {

        int zeroPointerIndex = -1;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == 0){
                zeroPointerIndex= i;
                break;
            }
        }

        for (int nonZeroIndex = zeroPointerIndex+1; nonZeroIndex < numbers.length; nonZeroIndex++){

            if (numbers[nonZeroIndex] != 0){
                numbers[zeroPointerIndex] = numbers[nonZeroIndex];
                numbers[nonZeroIndex] = 0;
                zeroPointerIndex++;
            }

        }

        System.out.println(Arrays.toString(numbers));
    }

    //practice
    private static void moveAllZeroesToRight2(int[] numbers) {

        System.out.println("Practice code!");
        int zeroPointerIndex = 0;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==0){
                zeroPointerIndex = i;
                break;
            }
        }

        for (int nonZeroPointerIndex= zeroPointerIndex + 1; nonZeroPointerIndex<numbers.length; nonZeroPointerIndex++){

            if (numbers[nonZeroPointerIndex]!=0){
                numbers[zeroPointerIndex] = numbers[nonZeroPointerIndex];
                numbers[nonZeroPointerIndex] = 0;
                zeroPointerIndex++;
            }

        }

        System.out.println(Arrays.toString(numbers));



    }

}
