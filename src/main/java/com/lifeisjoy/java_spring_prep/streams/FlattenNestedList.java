package com.lifeisjoy.java_spring_prep.streams;

import java.util.Collection;
import java.util.List;

public class FlattenNestedList {

    public static void main(String[] args) {

        List<List<Integer>> nested = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6, 7)
        );
        //expected output: [1, 2, 3, 4, 5, 6, 7]

        List<Integer> list1 = nested.stream().flatMap(Collection::stream).toList();
        System.out.println(list1);


    }

}
