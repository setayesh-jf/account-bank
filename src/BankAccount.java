

public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + "variz shod be shomareh hesab: " + accountNumber);
        }
        else {
            System.out.println("accountNumber is not true");
        }
    }

    public void withdraw(double amount){
    if (amount <= 0){
        System.out.println("amliat ghabel anjam nist!");
    }
    else {
        if (amount > balance){
            System.out.println("mojodi hesab kafi nist!");
        }
        else {
            balance -= amount;
            System.out.println("az hesab ba movafaghiat bardash shod!!" + amount + "az hesabeh: " + accountNumber);
        }
    }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

}


