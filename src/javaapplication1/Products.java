package javaapplication1;

public class Products {
    int productid, stock, sold;
    String name;
    double price;

    public void addProducts(int productid, String name, int sold, int stock, double price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.sold = sold;
    }

    public void viewProducts() {
        double profit = this.sold * this.price;
        String status = (this.stock < 1) ? "Out-of-Stock" : "Available";
        double expectedProfit = this.stock * this.price;

        System.out.printf("%-10d %-10s %-10d %-10d %-10.2f %-10.2f %-10s %-10.2f\n",
                this.productid, this.name, this.sold, this.stock, this.price, profit, status, expectedProfit);
    }
}
