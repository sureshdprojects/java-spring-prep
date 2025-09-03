package com.lifeisjoy.java_spring_prep.streams;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopNFrequentWords {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple", "kiwi");
        words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));

    }

}
