package com.lifeisjoy.java_spring_prep.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfTransactionsPerDay {

    public static void main(String[] args) {

        record Transaction(String date, Integer amount){};
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> collect = transactions.stream()
                .collect(
                    Collectors.groupingBy(
                            Transaction::date,
                            Collectors.summingInt(Transaction::amount)
                    )
                );

        System.out.println(collect);

    }

}
