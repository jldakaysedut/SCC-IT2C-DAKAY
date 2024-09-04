
package javaapplication1;

import java.util.Scanner;


public class Grade{
    
    public void Grade(){
    Scanner sc = new Scanner(System.in);
       Grades[] gr = new Grades[100];

         System.out.print("Enter number of Student: ");
         int nums = sc.nextInt();
  
  for(int i=0; i < nums; i++){
         
           System.out.println("Enter details of students "+(i+1)+":");
           System.out.println("ID: ");
           int studentid = sc.nextInt();
           System.out.println("Name: ");
           String name = sc.next();
           System.out.println("Prelim: ");
           double pre = sc.nextDouble();
           System.out.println("Midterm: ");
           double mid = sc.nextDouble();
           System.out.println("Prefinal: ");
           double prefi = sc.nextDouble();
           System.out.println("Final: ");
           double fin = sc.nextDouble();
           
           gr[i] = new Grades();
           gr[i].addGrades(studentid, name, pre, mid, prefi, fin);
           
           
       }
  
   System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s \n",
        "ID", "NAME", "PRELIM", "MIDTERM", "PREFINAL", "FINAL", "AVERAGE", "REMARKS");

       for(int i=0; i < nums; i++){
           gr[i].viewGrades();  
    
}
}
    
}