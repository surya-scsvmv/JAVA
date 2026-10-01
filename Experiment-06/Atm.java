class InvalidAmountException extends Exception { InvalidAmountException(String m){super(m);} }
class LowBalanceException extends Exception { LowBalanceException(String m){super(m);} }
public class Atm {
    static double balance=5000;
    static void withdraw(double amt) throws InvalidAmountException, LowBalanceException {
        if(amt%100!=0) throw new InvalidAmountException(amt+" is not a multiple of 100");
        if(amt>balance) throw new LowBalanceException("Balance is only "+balance);
        balance-=amt; System.out.println("Dispensed "+amt+", balance "+balance);
    }
    public static void main(String[] args) {
        double[] tries={2000,350,9000,1500};
        for(double a:tries){try{withdraw(a);}catch(Exception e){System.out.println("Refused : "+e.getMessage());}}
    }
}