package com.tyk;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        // Write your code here
        if (n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz");
        else if (n % 3 == 0) System.out.println("Fizz");
        else if (n % 5 == 0) System.out.println("Buzz");
        else System.out.println("i");
    }
}
