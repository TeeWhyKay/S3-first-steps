package com.yk;

import java.util.Arrays;

// Given an array arr[] of integers, the task is to arrange them in a way similar to the to-and-fro movement of a Pendulum without using any extra space.
//
//        Pendulum Arrangement:
//        The minimum element out of the list of integers must come in the center position of the array.
//        The number in the ascending order next to the minimum, goes to the right, the next higher number goes to the left of minimum number and it continues.
//        As higher numbers are reached, one goes to one side in a to-and-fro manner similar to that of a Pendulum.
//
//        Examples:
//        Input: arr[] = {2, 3, 5, 1, 4} => {1,2,3,4,5}
//        Output: 5 3 1 2 4
//        The minimum element is 1, so it is moved to the middle.
//        The next higher element 2 is moved to the right of the
//        middle element while the next higher element 3 is
//        moved to the left of the middle element and
//        this process is continued.
//
//        Input: arr[] = {11, 2, 4, 55, 6, 8}
//        Output: 11 6 2 4 8 55
public class PendulumSort {
    public static int[] pendulum(int[] input) {
        Arrays.sort(input);
        int middle  = input.length/2;
        if (input.length % 2 == 0) {
            middle -= 1;
        }
        int[] output = new int[input.length];
        int shift = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) output[middle - shift++] = input[i];
            else output[middle+shift]= input[i];
        }
        return output;
    }

    public static int[] pendulumInPlace(int[] input) {
        Arrays.sort(input); //O(nlog(n))

        // shift inplace all odd numbered indexes to end of array [1,2,3,4,5] -> [1,3,5,2,4]
        int end = input.length / 2;
        for(int start = 1;start<=end;start++) { // O(n^2)
            int temp = input[start];
            int s = start;
            while (s < input.length -1 ) {
                input[s] = input[++s];
            }
            input[input.length -1 ] = temp;
        }

        // reverse all the past 'even' numbered indexes at the front of the array [1,3,5,2,4] -> [5,3,1,2,4]
        int pairs, endIdx, shortLength = 0;
        if (input.length % 2 == 0) shortLength = end;
        else shortLength = end + 1;

        pairs = shortLength / 2;
        endIdx = shortLength - 1;
        for(int i =0 ;i<pairs;i++) {
            int temp = input[endIdx];
            input[endIdx--] = input[i];
            input[i] = temp;
        }

        return input;
    }

    public static int[] reverseInPlace(int[] input) {
        int pairs = input.length/2;
        int endIdx = input.length-1;
        for(int i =0 ;i<pairs;i++) {
            int temp = input[endIdx];
            input[endIdx--] = input[i];
            input[i] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pendulum(new int[]{4,3,2,1,5,6,7})));
        System.out.println(Arrays.toString(pendulumInPlace(new int[]{4,3,2,1,5,6,7})));
        System.out.println(Arrays.toString(pendulumInPlace(new int[]{11, 2, 4, 55, 6, 8})));
        System.out.println(Arrays.toString(pendulum(new int[]{11, 2, 4, 55, 6, 8})));
    }
}
