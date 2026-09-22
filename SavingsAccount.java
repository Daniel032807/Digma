public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, int accountNumber,
                          int initialBalance, double interestRate) {



        super(accountHolder, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }


    public void applyInterest() {
        int interest = (int) (getBalance() * interestRate);
        deposit(interest);
    }

    public double getInterestRate() {
    return interestRate; }
}
