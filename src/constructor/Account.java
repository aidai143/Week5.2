package constructor;

public class Account {
    String accountNumber;
    int balance;

    public Account(String accountNumber,int balance){
        if(accountNumber==null || accountNumber.isEmpty()){
            System.out.println("Error: accountNumber is invalid");
            return;
        }

        if(balance<0){
            System.out.println("Error: balance cannot be negative");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void printInfo(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
