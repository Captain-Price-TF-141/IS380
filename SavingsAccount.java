
//Captain-Price-TF-141

public class SavingsAccount extends BankAccount {

   //instance variables
   private static final double INTEREST_RATE = 2.5;
   private static int savingsNumber = 0;
   private String accountNumber;


   public SavingsAccount(String name, double amount) {
       super(name, amount);
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }


   public SavingsAccount(BankAccount oldAccount, double amount) {
       super(oldAccount, amount);
       savingsNumber++;
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }

   //method postInterest
   public void postInterest() {

       setBalance(getBalance() + (getBalance() * (INTEREST_RATE / 100)));
   }

   //override account number

   public String getAccountNumber() {

       return accountNumber;
   }

}