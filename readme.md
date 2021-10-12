# Introduction to Java

## Defining the main method
```java
public static void main(String[] args) {

}
```

The main method is the entry point of any java program. Its syntax is always as shown above. You can change the name of the parameter args, but it has to accept an array of string as input.

## Java is a statically-typed language
A programming language is statically-typed if it performs type checking at compile time. Type checking is the process of verifying that a program is type safe. A program is type safe if the arguments of all of its operations are the correct type.

A programming language is dynamically-typed if it performs type checking at runtime. JavaScript and Ruby are examples of dynamically typed languages.

## Primitive types

int, byte, short, long, float, double, char, boolean

The eight primitives in Java are not considered objects and represent raw values. They are stored directly on the stack

Each primitive type takes up different memory. See (here)[https://www.baeldung.com/java-primitives]

## Overflow

When we try to store a value into a primitive higher than its maximum value, we run into a situation called overflow.

```java
int i = Integer.MAX_VALUE;
int j = i + 1;
// j will roll over to -2_147_483_648

double d = Double.MAX_VALUE;
double o = d + 1;
// o will be Infinity
```
## Primitive conversions

Sometimes we need to convert from a primitive that's smaller than the destination type.

```java
int myInt = 127;
long myLong = myInt;
```

This is possbile because moving to a wider primitive does not lose any information.

Sometimes we need to fit a value that is larger than the type used in the variable declaration.

```java
int myInt = (int) myDouble;
byte myByte = (byte) myInt;
```

## Autoboxing

Every primitive data type has a full Java class implementation called wrapper classes. For instance, the Integer class can wrap an int. There is sometimes a need to convert from the primitive type to its object wrapper (e.g., using them with generics).

Luckily, Java can perform this conversion for us automatically. We call this process Autoboxing. Here is an example:

```java
Character c = 'c';

Integer i = 1;
```

## Logical AND operators

```java
&&
```

## Logical OR operators

```java
||
```

## Assignment vs Equals to
```java
int myInt = 1; //assignment
myInt == 1 // true
```

## Ternary Operator

```java
boolean isBig = (myInt > 10) ? true : false
```

## Operator precedence

See (here)[https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html]
