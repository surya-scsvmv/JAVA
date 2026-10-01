interface Shape { double area(); }
class Circle implements Shape { double r; Circle(double r){this.r=r;} public double area(){return 3.14159*r*r;} }
class Rect implements Shape { double l,b; Rect(double l,double b){this.l=l;this.b=b;} public double area(){return l*b;} }
public class ShapeDemo { public static void main(String[] args){Shape[] s={new Circle(5),new Rect(4,6)};for(Shape x:s)System.out.printf("%-8s area = %.2f%n",x.getClass().getSimpleName(),x.area());} }