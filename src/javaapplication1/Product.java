
package javaapplication1;

import java.util.Scanner;


public class Product {
  

    public void Product(){
        Scanner sc = new Scanner(System.in);
        Products[] pr = new Products[100];

        System.out.print("Enter the number of products: ");
        int nums = sc.nextInt();

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int productid = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            pr[i] = new Products();
            pr[i].addProducts(productid, name, sold, stock, price);
        }
        
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "Sold", "Stock", "Price", "Profit", "Status", "Expected Profit");

        for (int i = 0; i < nums; i++) {
            pr[i].viewProducts();
        }
    }
}


    