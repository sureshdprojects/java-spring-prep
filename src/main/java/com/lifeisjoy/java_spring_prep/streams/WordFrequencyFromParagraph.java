package com.lifeisjoy.java_spring_prep.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyFromParagraph {
    public static void main(String[] args) {
        // Given a paragraph of text, split it into words, normalize to lowercase, remove stopwords (the, is, a, an, of, etc.), and count word frequency.
        String text = "Java is great. Java is powerful. Java is everywhere.";
        List<String> stopwords = List.of("is", "a", "the");
        // expected output: java=3, great=1, powerful=1, everywhere=1

        Map<String, Long> collect = Arrays.stream(text.trim().split("\\W+")).map(String::toLowerCase).filter(word -> !stopwords.contains(word))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(collect);

    }
}
