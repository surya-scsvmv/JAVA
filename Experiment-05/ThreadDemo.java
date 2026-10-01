class First extends Thread { public void run(){for(int i=1;i<=3;i++)System.out.println("Thread A : "+i);} }
class Second implements Runnable { public void run(){for(int i=1;i<=3;i++)System.out.println("Thread B : "+i);} }
public class ThreadDemo { public static void main(String[] args){First a=new First();Thread b=new Thread(new Second());a.start();b.start();} }