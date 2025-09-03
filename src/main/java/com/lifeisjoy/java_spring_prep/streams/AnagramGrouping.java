package com.lifeisjoy.java_spring_prep.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramGrouping {
    public static void main(String[] args) {


        List<String> words = List.of("bat", "tab", "eat", "tea", "tan", "nat");
        //expected output: {abt=[bat, tab], aet=[eat, tea], ant=[tan, nat]}


        Map<String, List<String>> collect = words.stream().collect(
                Collectors.groupingBy(
                        w -> w.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()),
                        LinkedHashMap::new,
                        Collectors.toList()
                ));

        System.out.println(collect);

        String reduce = "bat".chars().sorted().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> {
            return a + b;
        });
        System.out.println(reduce);


    }
}
