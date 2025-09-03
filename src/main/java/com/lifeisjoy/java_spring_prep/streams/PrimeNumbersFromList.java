package com.lifeisjoy.java_spring_prep.streams;

import java.util.List;

public class PrimeNumbersFromList {

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 10, 11, 15, 17);
        //expected output: [2, 3, 5, 11, 17]

        List<Integer> primes = nums.stream().filter(PrimeNumbersFromList::isPrime).toList();
        System.out.println(primes);
    }

    public static boolean isPrime(Integer number){
        boolean isPrime = true;
        for(int i=2; i <= Math.sqrt(number); i++){
            if(number % i == 0 ){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
