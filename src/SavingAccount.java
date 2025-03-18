public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double balance){
    super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest(){
    double afzodehShodeh = interestRate * balance;
    deposit(afzodehShodeh);
    System.out.println("Sood afzodeh shod: " + afzodehShodeh + "be shomareh hesabeh: " + getAccountNumber());

    }
}
