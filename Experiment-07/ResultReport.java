import java.io.*;
public class ResultReport {
 public static void main(String[] args) {
  int pass=0,fail=0,total=0,n=0;
  try (BufferedReader br=new BufferedReader(new FileReader("student.txt")); PrintWriter pw=new PrintWriter("result.txt")) {
   String line;
   while((line=br.readLine())!=null){String[] f=line.split(",");int m=Integer.parseInt(f[2]);total+=m;n++;if(m>=50){pass++;pw.println(f[1]+" PASS");}else{fail++;pw.println(f[1]+" FAIL");}}
   pw.println("Passed : "+pass);pw.println("Failed : "+fail);pw.printf("Average : %.2f%n",(double)total/n);
   System.out.println("result.txt created. Passed "+pass+", failed "+fail);
  } catch(IOException e){System.out.println("File error : "+e.getMessage());}
 }
}