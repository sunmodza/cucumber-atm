package ku.atm;

public class BankAccount {
   private double balance;

   public BankAccount() {
      balance = 0;
   }

   public BankAccount(double balance) {
      this.balance = balance;
   }
 
   public void deposit(double amount) throws NotEnoughBalanceException {
      if (amount < 0 && Math.abs(amount) > balance) {
         throw new NotEnoughBalanceException("cannot deposit negative amount more than balance");
      }
      balance = balance + amount;
   }

   public void withdraw(double amount) throws NotEnoughBalanceException {
       if (amount > balance)
         throw new NotEnoughBalanceException("cannot withdraw more than balance");
       balance = balance - amount;
   }

   public double getBalance() {
      return balance; 
   }

}

