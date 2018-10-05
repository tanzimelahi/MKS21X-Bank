public class Driver{
    public static void main(String[]args){
    BankAccount x=new BankAccount(2200,721308,"jonaki77");
    if (x.withdraw(1000)){
       System.out.println("Withdrawl Success, yeah");
    }    
    else{
     System.out.println("failure");
  }
    System.out.println("should print yeah");
  System.out.println(x);
  System.out.println("Should print 721308 \t 1200");
   x.deposit(1000);
  System.out.println(x);
  System.out.println("should print 721308 \t 2200");
 }
}
