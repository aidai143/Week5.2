package inheritance;

public class SavingsAccount extends BankAccount{
    public SavingsAccount (double balance){
        super(balance);
    }

    public void withdraw(double amount){
        if (balance - amount < 200){
            System.out.println("Withdrawal is denied. Minimum balance required");
        }else {
            balance -= amount;
        }

    }

}
