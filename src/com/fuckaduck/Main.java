package com.fuckaduck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        switch(new Scanner(System.in).nextInt()) {
            case 1: ex_printInts1to100(); break;
            case 2: ex_printEvenInts2to100(); break;
            case 3: ex_oddNumberRange(); break;
        }
    }

    static void ex_oddNumberRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range start and range end separated by comma:");
        String[] rangeArgs = sc.nextLine().strip().split(",\\s*");

        int rangeStart = Integer.parseInt(rangeArgs[0]);
        int rangeEnd = Integer.parseInt(rangeArgs[1]);

        System.out.printf("Odd numbers inside range %s to %s: ", rangeStart, rangeEnd);

        if(rangeStart % 2 == 0) rangeStart++;

        for(int i = rangeStart; i <= rangeEnd; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    static void ex_printEvenInts2to100() {
        for(int i = 2; i <= 100; i = i+2) {
            System.out.print(i + " ");
        }
    }

    static void ex_printInts1to100() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
