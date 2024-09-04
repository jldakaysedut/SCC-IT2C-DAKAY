package javaapplication1;

public class Salaries {
    int id;
    String empName;
    double rate;
    double hour;
    double deduct;
    double gross;
    double netpay;

    public void addSalaries(int id, String empName, double rate, double hour, double deduct) {
        this.id = id;
        this.empName = empName;
        this.rate = rate;
        this.hour = hour;
        this.deduct = deduct;
        this.gross = rate * hour;
        this.netpay = gross - deduct;
   
    }
   
    public void viewSalaries(){
          
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f \n",
                id, empName, rate, hour, gross, deduct, netpay);
        
    }
    
    
    
}
