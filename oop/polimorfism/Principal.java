package oop.polimorfism;

public class Principal {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(5000);

        printBalance(account);

        // -----------------------------
        
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setBalance(3500);
        printBalance(currentAccount);

        // -----------------------------

        SavingAccount savingsAccount = new SavingAccount();
        savingsAccount.setBalance(1000);
        printBalance(savingsAccount);
    }

    // polimorfism: the same method can be used with different types of objects
    public static void printBalance(Account account) {
        System.out.println("Saldo: R$" + account.getBalance());

        // instance of: verify if the object is an instance of a class
        if(account instanceof CurrentAccount) {
            CurrentAccount currentAccount = (CurrentAccount) account; // casting: convert the object to a specific class
            System.out.println("Limite: R$" + currentAccount.getLimit());
        }

        if(account instanceof SavingAccount) {
            SavingAccount savingAccount = (SavingAccount) account;
            System.out.println("Rendimento: R$" + savingAccount.getIncome());
        }
    }
}
