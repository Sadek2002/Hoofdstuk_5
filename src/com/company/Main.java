package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("Wat is je toetscijfer?");
            double cijfer = scanner.nextDouble();
            if (cijfer == -1) {
                doorgaan = false;
                System.out.println("Tot ziens!");
            } else if (cijfer >= 5.5) {
                System.out.println("Je hebt een voldoende!");
            } else {
                System.out.println("Helaas, je hebt een onvoldoende");
            }
        }
    }
}