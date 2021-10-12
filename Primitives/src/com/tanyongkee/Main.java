package com.tanyongkee;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // int has a size of 32 bits
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Min Integer value = " + minInt);
        System.out.println("Max Integer value = " + maxInt);
        System.out.println("Overflowed min value = " + (minInt - 1));
        System.out.println("Overflowed max value = " + (maxInt + 1));

        // byte has a size of 8 bits
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min Byte Value = " + minByte);
        System.out.println("Max Byte Value = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min Short Value = " + minShort);
        System.out.println("Max Short Value = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long bigLongLiteralValue = 2147483647234L;
        System.out.println("Min Long Value = " + minLong);
        System.out.println("Max Long Value = " + maxLong);

        // casting
        byte newByte = (byte) (minByte / 2);

        byte cByte = 67;
        short cShort = 1269;
        int cInt = 1;
        long totalLong = 50000 + 10*(cByte + cShort + cInt);
        System.out.println("Total sum = " + totalLong);

        // single precision decimal number aka float
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Min Float Value = " + minFloat);
        System.out.println("Max Float Value = " + maxFloat);

        // double numbers are processed faster than floats as in the chip architecture, the processes are optimised for doubles
        double minDouble = Double.MIN_VALUE;
        double maxDouble  = Double.MAX_VALUE;
        System.out.println("Min Double Value = " + minDouble);
        System.out.println("Max Double Value = " + maxDouble);

        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        // Challenge
        double weightInPounds = 5.00;
        double weightInKg = weightInPounds * 0.45359237;
        System.out.println(weightInKg);

        // Big decimal, the right way to do precise calculations for currency
        BigDecimal myBigDecimal = new BigDecimal(10.51235);
        System.out.println("BigDecimal value = " + myBigDecimal);

        // Char
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("My Character = " + myChar);
        System.out.println("My Character using unicode = " + myUnicodeChar);

        // boolean
        boolean isCustomerOverTwentyOne = true;

        // Abbreviating Operators
        int myInt = 1;
        // Pre increment operators return the variable after performing the operation on the variable
        System.out.println("This should return 2 = " + ++myInt);
        // Post increment operators return the variable before performing the operation on the var
        System.out.println("This should still return 2, but the value is decremented =" + myInt--);
        System.out.println("Value of myInt = " + myInt);
        myInt += 2; // 1 + 2 = 3
        myInt *= 2; // 3 * 2  = 6
        System.out.println("Value of myInt now = " + myInt);

        System.out.println(5);
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        int day = 8;
        int month = 10;
        int year = 2021;
        String strDayOfWeek = LocalDate.parse(String.format("%d-%d-%02d", year, month, day)).getDayOfWeek().toString();
        System.out.println(strDayOfWeek);

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usd = usFormat.format(12324.134);

        NumberFormat rmbFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String rmb = rmbFormat.format(12324.134);

        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String euro = euroFormat.format(12324.134);

        NumberFormat rsFormat =  NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String rs = rsFormat.format(12324.134);

        int score = 6;
        boolean hasSuceeded = (score > 5) ? true : false;

        // operator precedence
        double d1 = 20.00;
        double d2 = 80.00;
        double d3 = (d1 + d2) * 100;
        double d4 = d3 % 40.00;
        boolean noRemainder = (d4 == 0) ? true : false;
        System.out.println(noRemainder);
        if (!noRemainder) System.out.println("Got some remainder");


    }

}
