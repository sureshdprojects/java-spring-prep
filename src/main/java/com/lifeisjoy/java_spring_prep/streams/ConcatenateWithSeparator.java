package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateWithSeparator {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");
        //expected output: Alice, Bob, Charlie

        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println(joined);


    }

}
