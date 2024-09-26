import java.util.ArrayList;
import java.util.List;

// Interface for Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

// Class representing a Bank
class Bank {
    private List<Account> accounts = new ArrayList<>();

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to display all accounts and their balances
    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Type: " + account.getClass().getSimpleName() + ", Balance: $" + account.getBalance());
        }
    }
}

// Class representing a Savings Account
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Class representing a Current Account
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically do not have interest, but you can customize it if needed
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Method specific to CurrentAccount
    public void setOverdraftLimit(double newLimit) {
        this.overdraftLimit = newLimit;
    }
}

// Main class to demonstrate the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create the bank
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000, 2.5);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations on accounts
        savingsAccount.deposit(200);
        savingsAccount.withdraw(150);
        currentAccount.deposit(100);
        currentAccount.withdraw(600);

        // Display account details
        bank.displayAccounts();

        // Display interest for savings account
        System.out.println("Interest on Savings Account: $" + savingsAccount.calculateInterest());
    }
}
