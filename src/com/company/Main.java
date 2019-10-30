package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner key = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            System.out.println("Please enter value #" + (i + 1) + ":");
            array[i] = key.nextInt();
        }
        random(250);
        System.out.println("Here is a random number generated between 1-250:" + random(251));

        sumOfArray(array);
        System.out.println("The sum of the values entered is: " + sumOfArray(array));
    }

    public static int random(int bound) {
        Random r = new Random();
        return(r.nextInt(bound));
    }

    public static int sumOfArray(int[]array) {
        int sum = 0;

        for(int num : array) {
            sum += num;
        }
        return sum;
    }
}
