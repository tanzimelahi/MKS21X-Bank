
public class BankAccount {
   private double balance;
   private int accountID;
   private String password;
   public BankAccount(double balance,int accountID,String password) {
	   this.balance=balance;
	   this.accountID=accountID;
	   this.password=password;
   }
   public double getBalance() {
	   return this.balance;
   }
   public int getAccountID() {
	   return this.accountID;
   }
   public String toString() {
	   return accountID+"\t"+ balance;
   }
   public boolean deposit(double money) {
	   if (money>=0) {
		   balance+=money;
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public boolean withdraw (double money) {
	   if (balance>=money) {
		   balance=balance-money;
		   return true;
	   }
	   else {
		   return false;
	   }
   }
private boolean authenticate(String password) {
	   if (password.equals(this.password)) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
public boolean transferTo(BankAccount other,double amount,String password) {
	   if (other.authenticate(password)) {
		   if(amount>=0) {
			   other.deposit(amount);
			   return true;
		   }
		   else {
			   return false;
		   }
	   }else {
		   return  false;
	   }
   }
}

