package com.pluralsight;

import java.util.Scanner;

public class MixedInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // "eat" the leftover CRLF

        System.out.println("What do you want to do? ");
        System.out.print(" Enter 'add' or 'subtract': ");
        String action = scanner.nextLine();
        System.out.println("Preparing to do math... ");



    }
}
