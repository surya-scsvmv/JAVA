// Case Study 1: mess bill using an array of objects
class Boarder {
    String name; int days;
    Boarder(String n, int d) { name = n; days = d; }
    double bill() { return days * 85.0; }
}
public class MessBill {
    public static void main(String[] args) {
        Boarder[] list = {new Boarder("Aravind",28), new Boarder("Divya",30), new Boarder("Karthik",25)};
        double total = 0;
        System.out.println("NAME       DAYS     BILL");
        for (Boarder b : list) {
            System.out.printf("%-10s %4d %8.2f%n", b.name, b.days, b.bill());
            total += b.bill();
        }
        System.out.printf("Total collection = Rs. %.2f%n", total);
    }
}