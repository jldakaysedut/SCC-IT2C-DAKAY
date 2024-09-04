package javaapplication1;

import java.util.Scanner;

public class NetPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age, rate, hours, deduct;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter rate per hour: ");
        rate = input.nextInt();
        System.out.print("Enter total hours worked: ");
        hours = input.nextInt();
        System.out.print("Enter total deduction: ");
        deduct = input.nextInt();

        System.out.println("Slip details:");
        System.out.println("Date: Aug 14, 2024");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total gross: " + (rate * hours));
        System.out.println("Total deductions: " + deduct);
        System.out.println("----------------------------------");
        System.out.println("Net pay: " + ((rate * hours) - deduct));
    }
}
