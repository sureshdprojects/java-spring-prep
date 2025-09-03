package com.lifeisjoy.java_spring_prep.streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Adam", "Bob", "Charlie", "Catherine");
        //expected output: {A=[Alice, Adam], B=[Bob], C=[Charlie, Catherine]}

        Map<Character, List<String>> result = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(result);

    }

}
