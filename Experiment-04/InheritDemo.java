class Person { String name; Person(String n){name=n;} void show(){System.out.println("Name   : "+name);} }
class Employee extends Person { double salary; Employee(String n,double s){super(n);salary=s;} void show(){super.show();System.out.println("Salary : "+salary);} }
class Manager extends Employee { String dept; Manager(String n,double s,String d){super(n,s);dept=d;} void show(){super.show();System.out.println("Dept   : "+dept);} }
public class InheritDemo { public static void main(String[] args){Person p=new Manager("Meena",75000,"CSE");p.show();} }