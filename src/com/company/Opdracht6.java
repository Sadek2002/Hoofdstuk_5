package com.company;

import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 100 ; i++) {
            if (i % 5 == 0)
                System.out.println(i + " is deelbaar door 5.");

        }
    }
}
