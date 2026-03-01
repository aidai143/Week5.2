package encapsulation;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void printInfo(){
        System.out.println("Account number: "+getAccountNumber());
        System.out.println("Account holder: "+getAccountHolder());
        System.out.println("Balance: "+getBalance());

    }

    public void deposit(double amount){
        balance = balance + amount;


    }

    public void withdraw(double amount){
        balance = balance - amount;
    }
}
