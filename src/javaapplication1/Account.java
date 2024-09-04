package javaapplication1;

import java.util.Scanner;

public class Account {
    
    
     public void Account(){
    
        Scanner sc = new Scanner(System.in);
        Accounts[] ar = new Accounts[100];

        System.out.print("Enter number of accounts: ");
        int nums = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of account " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            ar[i] = new Accounts();
            ar[i].addAccounts(id, firstName, lastName, email, username, password);
        }
        
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n",
        "ID", "NAME", "LASTNAME", "EMAIL", "USERNAME", "PASSWORD");

        for (int i = 0; i < nums; i++) {
            ar[i].viewAccounts();
        }

        sc.close();
    
}
}