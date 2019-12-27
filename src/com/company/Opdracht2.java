package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int punten = 0;
            for (int i = 0; i <10 ; i++) {
                int random = (int) (Math.random() * 10 + 1);
                int random1 = (int) (Math.random() * 10 + 1);
                System.out.println("Wat is " + random + " x " + random1);
                int uitkomst = random * random1;
                int userInput = scanner.nextInt();
                if (userInput == uitkomst) {
                    System.out.println("Dat is goed!");
                    punten++;
                } else {
                    System.out.println("Sorry dat is fout het was " + uitkomst);
                }
            }
            System.out.println("Je totale score was " + punten + ".");
        }
}

