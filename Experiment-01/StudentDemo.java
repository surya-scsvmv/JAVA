// Ex 1(a): class, object and methods
class Student {
    int roll; String name; int marks;
    void set(int r, String n, int m) { roll = r; name = n; marks = m; }
    void show() { System.out.println(roll + "    " + name + "                    " + marks); }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(), s2 = new Student();
        s1.set(101, "Aravind", 78); s2.set(102, "Divya", 91);
        System.out.println("ROLL NAME        MARKS"); s1.show(); s2.show();
    }
}