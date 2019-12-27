package com.company;

import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        int lowestNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ 5 getallen");
        for (int i = 0; i < 5; i++) {
            int userInput = scanner.nextInt();
            if (i == 0) {
                lowestNumber = userInput;
            } else {
                if (userInput < lowestNumber) {
                    lowestNumber = userInput;
                }
            }
        }
        System.out.println("Het laagst ingevulde getal is " + lowestNumber + ".");
    }
}
