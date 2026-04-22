public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            balance = 0;
        } else {
            balance = initialBalance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            balance = 0; // prevents negative balance
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}
