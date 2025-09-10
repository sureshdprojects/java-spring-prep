package com.lifeisjoy.java_spring_prep.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondHighestSalary {

    public static void main(String[] args) {

        record Employee(int id, String name, double salary) {}
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 70000),
                new Employee(3, "Charlie", 60000),
                new Employee(4, "David", 80000),
                new Employee(4, "David-2", 80000)
        );
        //expected output: Charlie=60000.0  OR  Bob=70000.0 (depending on interpretation: 2nd highest vs. 2nd distinct highest)

        employees.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .skip(1).findFirst().ifPresent(e-> System.out.println(e.name() + "=" + e.salary()));

        //if we have to find only second salary, if we do not need name
        Double secondHighestSalary =
                employees.stream().map(Employee::salary)
                .distinct()
                .sorted(Collections.reverseOrder())
                        .skip(1)
                        .findFirst().orElse(null);

        System.out.println(secondHighestSalary);



    }

}
