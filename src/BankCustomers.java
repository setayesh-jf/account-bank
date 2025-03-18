import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account){
        accountsList.add(account);
    }

    public void showAllBalances(){
       for (BankAccount account : accountsList){
           System.out.println("username: " + account.getAccountHolderName() + "account number: " + account.getAccountNumber() + "balance: " + account.getBalance());
       }
    }

    public BankAccount findAccount(String accountNumber){
        for (BankAccount account : accountsList){
            if (account.getAccountNumber().equals(accountNumber)){
                System.out.println("account found!: " + "account number: " + account.getAccountNumber() + "balance: " + account.getBalance());
                return account;
            }
        }
        System.out.println("account number: " + accountNumber + "not found!!.");
        return null;
    }
}

