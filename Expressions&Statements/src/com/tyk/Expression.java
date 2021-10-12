package com.tyk;

public class Expression {
    public static void main(String[] args) {
        // Expression
        int myInt = 5; // This is a statement, while myInt = 5 is an expression
//      An expression is a construct made up of variables, operators, and method invocations,
//      which are constructed according to the syntax of the language, that evaluates to a single value.

//        Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of execution.
//        The following types of expressions can be made into a statement by terminating the expression with a semicolon (;).

//        Assignment expressions
//        Any use of ++ or --
//        Method invocations
//        Object creation expressions
        // declaration statement
        double aValue = 1.00;
        // assignment statement
        aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement



        // block scope

        if (true) {
            int myVariable = 5;
        }
        // variables declared in the code block cannot be accessed outside the code block
        // myVariable++;

        // method overloading
        // A method of the same name can accept different number of parameters and type of parameters.
        // They have to be returning the same datatype to prevent ambiguity.

        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
        public static double area(double radius) {
            return (radius < 0 ) ? -1.0 : Math.PI * radius * radius;
        }
        // Coding Exercise 9: Minutes to years and days calculator
        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) System.out.println("Invalid Value");
            else {
                int year = (int) minutes / 525600;
                int days = (int) (minutes % 525600) / 1440;
                System.out.printf("%d min = %d y and %d d%n", minutes, year, days);
            }
        }
        // Equality Printer
        public static void printEqual(int a, int b, int c) {
            if (a < 0 || b < 0 || c < 0) System.out.println("Invalid Value");
            else if (a == b && b == c) System.out.println("All numbers are equal");
            else if (a != b && b != c && a != c) System.out.println("All numbers are different");
            else System.out.println("Neither all are equal of different");
        }
        // Playing cat
        public static boolean isCatPlaying(boolean summer, int temperature) {
            return summer ? (temperature >= 25 && temperature >= 45) : (temperature >= 25 && temperature >= 35);
        }


}
