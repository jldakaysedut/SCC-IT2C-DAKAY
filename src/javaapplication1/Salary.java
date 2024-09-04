package javaapplication1;

import java.util.Scanner;

public class Salary {
    
    public void Salary(){
        Scanner sc = new Scanner(System.in);
        Salaries[] sr = new Salaries[100];

        System.out.print("Enter number of Employees: ");
        int nums = sc.nextInt();
        
        
        

        for (int i = 0; i < nums; i++) {
            System.out.println("Details of EMP " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String empName = sc.next();
            System.out.print("Rate (hour): ");
            double rate = sc.nextDouble();
            System.out.print("Hours Worked: ");
            double hour = sc.nextDouble();
            System.out.print("Total Deduction: ");
            double deduct = sc.nextDouble();

            
            sr[i] = new Salaries();
            sr[i].addSalaries(id, empName, rate, hour, deduct);
        }
        
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n",
        "ID", "NAME", "RATE", "HOURS", "GROSS", "DEDUCT", "NETPAY");

        double totalGross = 0.00;
        double totalDeduct = 0.00;
        double totalNetPay = 0.00;

        for (int i = 0; i < nums; i++) {
            sr[i].viewSalaries();
            totalGross += sr[i].gross;
            totalDeduct += sr[i].deduct;
            totalNetPay += sr[i].netpay;
        }

        System.out.printf("\nTotal Salary Request: %.2f\n", totalGross);
        System.out.printf("Total Deduction: %.2f\n", totalDeduct);
        System.out.printf("Total Salary to Release: %.2f\n", totalNetPay);
    }
}


