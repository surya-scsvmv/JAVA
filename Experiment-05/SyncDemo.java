class Counter {
    private int count = 0;
    synchronized void increment() { count++; }
    int get() { return count; }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable job = () -> { for (int i=0;i<10000;i++) c.increment(); };
        Thread t1=new Thread(job); Thread t2=new Thread(job);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Final count = " + c.get());
    }
}