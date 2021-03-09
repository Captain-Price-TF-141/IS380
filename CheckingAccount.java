
//Captain-Price-TF-141

public class CheckingAccount extends BankAccount {

   // constant
   protected static final double FEE = .15;


   
   public CheckingAccount(String name, double amount) {
       super(name, amount);
       setAccountNumber(getAccountNumber() + "-10");
   }

   public boolean withdraw(double amount) {

       if (getBalance() < amount) {

           return false;
       } else {

           setBalance(getBalance() - amount - FEE);
           return true;
       }
   }

}
