package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner key = new Scanner(System.in);

        for(int i = 1; i < 14; i++) {
            System.out.println("please enter item #" + i + ":");
            String item = key.next();
            array.add(item);
        }
        System.out.println(array);
    }
}
