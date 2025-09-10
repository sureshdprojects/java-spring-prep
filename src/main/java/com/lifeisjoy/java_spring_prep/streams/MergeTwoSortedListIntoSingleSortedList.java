package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedListIntoSingleSortedList {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 6);
        List<Integer> list2 = List.of(3, 4, 5);

        List<Integer> sortedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .toList();

        System.out.println(sortedList);
    }

}
