interface Payment { double charge(double amount); String name(); }
class Upi implements Payment { public double charge(double a){return 0;} public String name(){return "UPI";} }
class Card implements Payment { public double charge(double a){return a*0.02;} public String name(){return "Card";} }
class Cash implements Payment { public double charge(double a){return 20;} public String name(){return "Cash";} }
public class PaymentDemo { public static void main(String[] args){double fee=75000;Payment[] modes={new Upi(),new Card(),new Cash()};for(Payment m:modes)System.out.printf("%-5s charge %8.2f total %10.2f%n",m.name(),m.charge(fee),fee+m.charge(fee));}}