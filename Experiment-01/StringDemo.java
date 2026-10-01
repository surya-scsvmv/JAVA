// Ex 1(c): common String methods
public class StringDemo {
    public static void main(String[] args) {
        String s = "SCSVMV University";
        System.out.println("Length      : " + s.length());
        System.out.println("Upper case : " + s.toUpperCase());
        System.out.println("First six   : " + s.substring(0, 6));
        System.out.println("Position of U: " + s.indexOf('U'));
        System.out.println("Replace S->X: " + s.replace('S', 'X'));
        System.out.println("Original    : " + s);
        String a = "madam";
        String b = new StringBuilder(a).reverse().toString();
        if (a.equals(b)) System.out.println(a + " is a palindrome");
        else System.out.println(a + " is not a palindrome");
    }
}