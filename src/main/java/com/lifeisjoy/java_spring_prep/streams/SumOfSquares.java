package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;

public class SumOfSquares {

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 4, 6, 8, 10);
        //expected output: 6² + 8² + 10² = 36 + 64 + 100 = 200

        Integer sum = nums.stream().filter(n -> n > 5).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);

        int sum1 = nums.stream().filter(n -> n > 5).mapToInt(n -> n * n).sum();
        System.out.println(sum1);
    }

}
