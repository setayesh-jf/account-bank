
public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500.0;

    public TransactionAccount (String accountHolderName, String accountNumber, double initialBalance){
        super(accountNumber, accountHolderName, initialBalance);

    }

    @Override
    public void calculateInterest(){
        System.out.println("Hich afzodehee nadashtim!");
    }

    @Override
    public void withdraw (double amount){
        if (amount <= 0){
            System.out.println("emchan bargharari amaliat nist!");
        }
        else {
            if (amount > (balance + overDraftLimit)){
                System.out.println("bardasht bishtar az mojodi hesabeh va amliat ghabel anjam nist!");
            }
            else {
                balance -= amount;
                System.out.println("amaliat ba movafaghiat anjam shod!!: " + amount + "az hesabeh: " + getAccountNumber() + "update mojodi hesab: " + balance);
            }
        }
    }
}
