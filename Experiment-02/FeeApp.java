import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;
public class FeeApp {
    public static void main(String[] args) {
        Student[] s = {new Student("Meena","BE"), new Student("Ravi","ME"), new Student("Anu","BSc")};
        double total = 0;
        for (Student x : s) {
            double f = FeeRule.fee(x.course);
            System.out.printf("%-8s %-5s %10.2f%n", x.name, x.course, f);
            total += f;
        }
        System.out.printf("Total fee = %.2f%n", total);
    }
}