package com.lifeisjoy.java_spring_prep.concepts;


/*
* Interface that has exactly one abstract method is called Functional Interface
* it can have any number of default and static methods, but only one abstract method
* it is basis for lambda expressions
*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface CustomFunctionalInterface {
    void print(String string);
}

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {

        //custom functional interface
        CustomFunctionalInterface object = (input) -> {
            System.out.println("console: " + input);
        };
        object.print("suresh");

        /*
            Java built-in functional interfaces
            Predicate<T> → takes T, returns boolean.
            Function<T,R> → takes T, returns R.
            Consumer<T> → takes T, returns nothing.
            Supplier<T> → takes nothing, returns T.
        */

        Predicate<Integer> predicate = n -> n%2 == 0;
        System.out.println(predicate.test(2));

        Function<String,String> function = input -> input!=null ? input.toUpperCase() : null;
        System.out.println(function.apply("Suresh"));
        System.out.println(function.apply(null));

        Consumer<String> consumer = input -> System.out.println("Consumer: " + input);
        consumer.accept("Suresh");

        Supplier<Double> supplier = () -> Math.random() * 10;
        System.out.println(supplier.get());

    }

}


