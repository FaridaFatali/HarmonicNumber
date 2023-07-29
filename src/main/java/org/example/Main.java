package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=vNdwsIG84_A&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=21
 *
 * @author Farida Fatali
 */

// Finding harmonic number of the number entered by the user (in 3 ways: using for, while, do-while)
// Ex: if he enters 5, it might be [harmonic number = 1/1 + 1/2 + 1/3 + 1/4 + 1/5]

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();

        // USING FOR:
        double result = 0;
        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("The result: " + result);


//        double i = 1;
//        double result = 0;
//        // USING WHILE:
//        while (i <= number){
//            result += (1 / i);
//            i++;
//        } System.out.println("The result: " + result);


        // USING DO WHILE:
//        do {
//            result += (1 / i);
//            i++;
//        } while (i <= number);
//        System.out.println("The result: " + result);
    }
}