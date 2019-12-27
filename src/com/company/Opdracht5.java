package com.company;

import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hoogsteCijfer = 0;
        String student = "unknown";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Wat is de naam van de " + i + "e student");
            String name = scanner.nextLine();
            System.out.println("Wat is zijn of haar cijfer?");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            if (i == 0) {
                hoogsteCijfer = grade;
                student = name;
            } else {
                if (grade > hoogsteCijfer) {
                    hoogsteCijfer = grade;
                    student = name;
                }
            }
        }
            System.out.println("Het hoogst gehaalde cijfer is behaald door " + student);
        System.out.println("Het cijfer van " + student + " is " + hoogsteCijfer);
        }
    }
