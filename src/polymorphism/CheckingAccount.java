package polymorphism;

public class CheckingAccount extends BankAccount{
    private final double fee = 4.3;

    public CheckingAccount(double balance) { super(balance); }

    public void withdraw(double amount) {
        double total = amount + fee;
        if (total <= balance) {
            balance -= total;
            System.out.println("Withdrew $" + amount + " (+ $" + fee + " fee). Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal and fee.");
        }
    }
}



