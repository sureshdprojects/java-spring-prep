package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;

public class InterSectionBetweenTwoLists {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3,4);
        List<Integer> list2 = List.of(3, 4, 5);
        List<Integer> commonElements = list1.stream().filter(list2::contains).toList();
        System.out.println(commonElements);

    }

}
