package com.lifeisjoy.java_spring_prep.streams;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesWhilePreservingTheOrder {

    public static void main(String[] args) {

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream().distinct().toList();
        System.out.println(numbersWithoutDuplicates);
    }

}
