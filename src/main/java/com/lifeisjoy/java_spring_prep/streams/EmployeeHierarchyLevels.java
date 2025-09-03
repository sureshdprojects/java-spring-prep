package com.lifeisjoy.java_spring_prep.streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeHierarchyLevels {
    public static void main(String[] args) {

        /*
           Employee Hierarchy Levels
           Given a list of employees with id, name, and managerId, use streams to build a mapping of each manager to their list of direct reports.
        */

        record Employee(int id, String name, Integer managerId) {}
        List<Employee> employees = List.of(
                new Employee(1, "Alice", null),   // CEO
                new Employee(2, "Bob", 1),
                new Employee(3, "Charlie", 1),
                new Employee(4, "David", 2),
                new Employee(5, "Eve", 2),
                new Employee(6, "Frank", 3)
        );

        /*
            expected output
            1 -> [Bob, Charlie]
            2 -> [David, Eve]
            3 -> [Frank]
        */

        Map<Integer, List<String>> result = employees.stream().filter(emp -> emp.managerId() != null).collect(Collectors.toMap(
                Employee::managerId,
                emp -> {
                    List<String> names = new ArrayList<>();
                    ;
                    names.add(emp.name());
                    return names;
                },
                (existing, replacement) -> {
                    existing.add(replacement.getFirst());
                    return existing;
                },
                () -> new TreeMap<>(Comparator.reverseOrder())
        ));

        System.out.println(result);


    }
}
