package com.lifeisjoy.java_spring_prep.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3);
        //expected output [1, 2, 3]

        List<Integer> list1 = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();

        System.out.println(list1);

        Set<Integer> seen = new HashSet<>();
        List<Integer> list2 = nums.stream().filter(n -> !seen.add(n)).toList();

        System.out.println(list2);

        List<Integer> repeatedNumbers = nums.stream().collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(repeatedNumbers);


    }

}
