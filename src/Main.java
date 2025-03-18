public class Main {
    public static void main(String[] args) {
        BankCustomers bankCustomers = new BankCustomers();

        TransactionAccount account1 = new TransactionAccount("Roza", "6104-8810-6522-1243", 500.550);
        TransactionAccount account2 = new TransactionAccount("Maryam", "6280-1453-7748-1249", 1000.500);
        TransactionAccount account3 = new TransactionAccount("Roya", "5859-8310-6788-9954", 500.999888);

        SavingAccount saveaccount1 = new SavingAccount("Baran", "6037-9976-1711-8910", 550.4478);
        SavingAccount saveaccount2 = new SavingAccount("Yas", "6180-6677-3322-1249", 999.112);
        SavingAccount saveaccount3 = new SavingAccount("Eli", "6104-7732-1288-9956", 332.998);

        bankCustomers.addAccount(account1);
        bankCustomers.addAccount(account2);
        bankCustomers.addAccount(account3);
        bankCustomers.addAccount(saveaccount1);
        bankCustomers.addAccount(saveaccount2);
        bankCustomers.addAccount(saveaccount3);

        bankCustomers.findAccount("5859-8310-6788-9954");
        bankCustomers.findAccount("4810-9899-6587-3455");

        System.out.println("mojodi avalieh account1: " + account1.getBalance());
        account1.deposit(500.0);
        System.out.println("update account1 pas az varizi: " + account1.getBalance());

        System.out.println("mojodi avalieh account2: " + account2.getBalance());
        account2.deposit(-880.0);
        System.out.println("mablagh varizi dorost nist");

        saveaccount1.calculateInterest();
        account3.calculateInterest();

        System.out.println("mojodi avalieh saveaccount1: " + saveaccount1.getBalance());
        System.out.println("mojodi avalieh account3: " + account3.getBalance());

        account1.withdraw(300.0);
        account2.withdraw(0.0);
        account3.withdraw(800.00000);

        saveaccount1.withdraw(200.0);
        saveaccount2.withdraw(-100.0);
        saveaccount3.withdraw(4000.00);

        bankCustomers.showAllBalances();
    }
}