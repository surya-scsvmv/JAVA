import java.sql.*;
import java.util.Scanner;
public class StudentApp {
    static void run(String sql,Object... v) {
        try(Connection c=Db.open(); PreparedStatement p=c.prepareStatement(sql)) {
            for(int i=0;i<v.length;i++) p.setObject(i+1,v[i]);
            if(sql.startsWith("SELECT")) {
                ResultSet rs=p.executeQuery();
                while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            } else System.out.println(p.executeUpdate()+" row(s) affected.");
        } catch(SQLException e) { System.out.println("Error : "+e.getMessage()); }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Register number to search : ");
        String reg=sc.nextLine();
        run("SELECT * FROM student WHERE reg_no = ?",reg);
        run("UPDATE student SET marks = ? WHERE reg_no = ?",95,reg);
        run("SELECT * FROM student WHERE reg_no = ?",reg);
    }
}