public class CurrentAccount extends BankAccount {


    public CurrentAccount(String accountHolder, int accountNumber, int initialBalance
                          ) {
        super(accountHolder, accountNumber, initialBalance);

    }

    public void withdraw(int amount) {
        if (amount > 0 && (getBalance()) >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println(" failed.");
        }
    }
}

