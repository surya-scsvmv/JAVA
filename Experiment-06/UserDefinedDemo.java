class InvalidAgeException extends Exception { InvalidAgeException(String msg){super(msg);} }
public class UserDefinedDemo {
static void verify(int age)throws InvalidAgeException{if(age<18)throw new InvalidAgeException("Age "+age+" is below 18");System.out.println("Age "+age+" accepted");}
public static void main(String[] args){try{verify(21);verify(15);}catch(InvalidAgeException e){System.out.println("Rejected : "+e.getMessage());}}}