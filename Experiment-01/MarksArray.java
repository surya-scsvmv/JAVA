// Ex 1(b): array + for loop + if-else + operators
public class MarksArray {
    public static void main(String[] args) {
        int[] m = {78, 91, 45, 66, 88}; int total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i];
            if (m[i] >= 50) System.out.println(m[i] + " Pass");
            else System.out.println(m[i] + " Fail");
        }
        double avg = total / (double)m.length;
        System.out.println("Total    = " + total);
        System.out.println("Average = " + avg);
    }
}