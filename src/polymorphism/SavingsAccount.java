package polymorphism;

public class SavingsAccount extends BankAccount{
    private final double limit = 400;

    public SavingsAccount(double balance) { super(balance); }

    public void withdraw(double amount) {
        if (amount > limit) {
            System.out.println("Withdrawal denied: Savings limit is $400");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        }
    }
}
