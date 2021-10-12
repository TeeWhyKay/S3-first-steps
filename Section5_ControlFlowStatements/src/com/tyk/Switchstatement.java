package com.tyk;

import java.time.YearMonth;
import java.util.HashMap;

public class Switchstatement {
    public static void main(String[] args) {
        char c = 'e';
        switch(Character.toLowerCase(c)) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.printf("It's %s%n", c);
                break;
            default:
                System.out.println("It's not abcd or e");
                break;
        }

        printDayOfTheWeek(3);
        System.out.println(getDaysInMonth(12, 10000));
        int count = 0;
        int sum = 0;
        for(int i=1;i<1001;i++) {
            if (i%3==0 && i%5==0) {
                sum += i;
                System.out.println(i);
                count++;
                if (count == 5) break;
            }
        }
        System.out.println(sum);
        System.out.println("Sum digits = " + sumDigits(125));
        System.out.println("Sum digits = " + sumDigits(32123));

        System.out.println("Is palindrome = " + isPalindrome(707));
        System.out.println("Is palindrome = " + isPalindrome(-1221));
        System.out.println("Is palindrome = " + isPalindrome(10));

        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(252));
        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(257));
        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(0));
        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(5));
        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(-10));
        System.out.println("sum first and last = " + sumFirstAndLastDigitNum(10));

        int[] arr = new int[]{2,7,11,15,8};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.printf("[%d, %d]%n", result[0], result[1]);
    }

    public static void printDayOfTheWeek(int i) {
        switch (i) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        YearMonth currentMonth = YearMonth.of(year, month);
        return currentMonth.lengthOfMonth();
    }

    public static int sumDigits(int digit) {
        if (digit < 10) return -1;
        int sum = 0;
        while( true ) {
            sum += digit % 10;
            digit /= 10;
            if ((digit / 10) < 10) {
                sum = sum + (digit % 10) + (digit / 10);
                break;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int i) {
        int originalNumber = (i < 0) ? i*-1:i;
        i = originalNumber;
        int reversed = 0;
        while( i > 0 ) {
            reversed = reversed * 10 + (i % 10);
            i /= 10;
        }
        return reversed==originalNumber;
    }

    public static int sumFirstAndLastDigit(int i) {
        if (i < 0 ) return -1;
        String integerStr = String.valueOf(i);
        return Character.getNumericValue(integerStr.charAt(0)) + Character.getNumericValue(integerStr.charAt(integerStr.length() -1));
    }

    public static int sumFirstAndLastDigitNum(int i) {
        int sum = (i >= 0) ? i%10:-1;

        while(i > 0) {
            i /=10;
            if (i / 10 == 0) {
                sum += i % 10;
                break;
            }
        }
        return sum;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainderIdx = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (remainderIdx.containsKey(nums[i])) {
                result[0] = remainderIdx.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                remainderIdx.put(remainder, i);
            }
        }
        return result;
    }
}
