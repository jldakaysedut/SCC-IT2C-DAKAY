package javaapplication1;


public class Accounts {
    double id;
    String firstName;
    String lastName;
    String email;
    String username;
    String password;

    public void addAccounts(double sid, String sfirstName, String slastName, String semail, String susername, String spassword) {
        this.id = sid;
        this.firstName = sfirstName;
        this.lastName = slastName;
        this.email = semail;
        this.username = susername;
        this.password = spassword;
    }

    
    public void viewAccounts() {
        System.out.printf("%-10.0f %-10s %-10s %-10s %-10s %-10s\n",
                this.id, this.firstName, this.lastName, this.email, this.username, this.password);
    }
}