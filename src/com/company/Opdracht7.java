package com.company;

import java.util.Scanner;

public class Opdracht7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;
        int counter = 0;
        while (proceed) {
            int square = counter * counter;
            if (square < 1000) {
                System.out.println("Het getal is " + counter);
                System.out.println("Het kwadraat van daarvan is " + square);
                counter++;
            } else {
                proceed = false;
            }
        }
    }
}


