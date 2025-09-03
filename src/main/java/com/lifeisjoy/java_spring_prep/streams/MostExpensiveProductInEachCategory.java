package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostExpensiveProductInEachCategory {
    public static void main(String[] args) {
        record Product(int id, String name, String category, double price) {}
        List<Product> products = List.of(
                new Product(1, "iPhone", "Electronics", 1000),
                new Product(2, "Galaxy", "Electronics", 900),
                new Product(3, "Shirt", "Clothing", 50),
                new Product(4, "Jeans", "Clothing", 80),
                new Product(5, "Fridge", "Appliances", 1200)
        );
        //expected output: Electronics=iPhone, Clothing=Jeans, Appliances=Fridge

        Map<String, Product> result = products.stream().collect(Collectors.toMap(
                Product::category,
                p -> p,
                (existing, replacement) -> {
                    if (existing.price() > replacement.price()) {
                        return existing;
                    } else {
                        return replacement;
                    }
                }
        ));

        System.out.println(result);

    }
}
