package com.lifeisjoy.java_spring_prep.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestString {

    public static void main(String[] args) {

        //christin and jonathan has same character length
        List<String> names = List.of("Alice", "Jonathan", "Bob", "Christin", "Eve");

        names.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);

        //if we want to get both longest strings

        Map<Integer, List<String>> lengthMap = names.stream().collect(Collectors.groupingBy(String::length));
        Integer maxLength = Collections.max(lengthMap.keySet());
        System.out.println(lengthMap.get(maxLength));

        //same solution in another style
        List<String> longestStrings = names.stream().collect(Collectors.collectingAndThen(
                Collectors.groupingBy(String::length),
                map -> {
                    int maxLen = Collections.max(map.keySet());
                    return map.get(maxLen);
                }
        ));
        System.out.println(longestStrings);


    }

}
