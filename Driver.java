
public class Driver {
   public static void main(String[] args){
   BankAccount bank=new BankAccount(12.4,72,"go");
   bank.deposit(100);
   System.out.println(bank.getBalance());
   System.out.println(bank.withdraw(1000));
   System.out.println(bank.withdraw(12.4));
   
   System.out.println(bank.getBalance());
   BankAccount yeah=new BankAccount(0,308,"mustafa");
   System.out.println(bank.transferTo(yeah,100,"mustafa"));//should print true
   System.out.println(yeah.getBalance());//should update balance to 100
   System.out.println(bank.transferTo(yeah,100,"karim"));//should print false
   System.out.println(bank.transferTo(yeah,-100,"mustafa"));//should print false
   }
}

