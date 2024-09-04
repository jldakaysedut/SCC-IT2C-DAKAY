
package javaapplication1;

public class Grades {
    
    int studentid;
    String name;
    double pre, mid, prefi, fin;
    
    
    
    public void addGrades(int sstudentid, String sname, double spre, double smid, double sprefi, double sfin){
      
        this.studentid = sstudentid;
        this.name =sname;
        this.pre = spre;
        this.mid = smid;
        this.prefi = sprefi;
        this.fin = sfin;
        
        
    }
    
    public void viewGrades(){
        double average = (this.pre + this.mid + this.prefi + this.fin)/4;
        String remarks;
        
    if (average > 3.0) {
        remarks = "Failed";
    } else {
        remarks = "Passed";
    }
        
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s \n",
                this.studentid, this.name, this.pre, this.mid, this.prefi, this.fin,
                average, remarks);
        
        
    
    
    
}


}