package com.lifeisjoy.java_spring_prep.dsa.arrays.basic;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        System.out.println(isArraySorted(new int[]{1,2,3,4,5}));
        System.out.println(isArraySorted(new int[]{1,2,3,4,6,4}));
    }

    public static boolean isArraySorted(int[] array){
        for (int i=1; i<array.length; i++){
            if(array[i] < array[i-1]) return false;
        }
        return true;
    }
}
