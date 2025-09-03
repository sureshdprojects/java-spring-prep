package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOrOdd {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);
        //expected output: {false=[1, 3, 5, 7], true=[2, 4, 6]}

        Map<Boolean, List<Integer>> partitions = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitions);

    }

}
