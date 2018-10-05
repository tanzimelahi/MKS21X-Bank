public class BankAccount{
   private double balance;
   private int accountID;
   private String password;
   public BankAccount(double b,int a,String p){
        balance=b;
        accountID=a;
        p=password;
    }
   public double getbalance(){
     return balance;
    }
   public int accountID(){
     return accountID;
    }
   public void setPassword(String x){
       password=x;
    }
   public String toString(){
          return ""+accountID+"\t"+balance;
    }
   public boolean deposit(double n){
       if(n>=0){
          balance+=n;
         return true;
        }
        else{
           return false;
        }
      }
   public boolean withdraw(double n){
          if(n<=balance && n>=0){
            balance-=n;
            return true;
          }
          else{
          return false;
          }
   }
}
    

