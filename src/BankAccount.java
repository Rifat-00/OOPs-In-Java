import java.util.Scanner;

public class BankAccount {
    // Attribute fields
    private final int accountNumber;
    private final String ownerName;
    private final int password;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String ownerName, int password, double deposit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.password = password;
        this.balance = deposit;
    }

    // Authentication
    public boolean auth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number:");
        int checkAccountNumber = scanner.nextInt();
        System.out.println("Enter the password:");
        scanner.nextLine(); // Consume the newline character
        int pass = scanner.nextInt();
        return checkAccountNumber == this.accountNumber && pass == this.password;
    }

    // Methods
    public double getBalance() {
        if (auth()) {
            return this.balance;
        } else {
            System.out.println("Wrong credentials");
            return -1;
        }
    }

    public void deposit(double deposit) {
        if (auth()) {
            this.balance += deposit;
        } else {
            System.out.println("Please complete the authentication by calling .auth() to proceed further");
        }
    }

    public double withdraw(double amount) {
        if (auth()) {
            if (amount <= this.balance) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Please complete the authentication by calling .auth() to proceed further");
        }
        return this.balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        BankAccount bankAccount = new BankAccount(123456, "John Doe", 1234, 1000);


//        if (balance >= 0) {
//            System.out.println("Balance: " + balance);
//        }

        bankAccount.withdraw(500);
        double balance = bankAccount.getBalance();
        System.out.println("Balance: " + balance);

        // Close the scanner when you're done using it
        scanner.close();
    }
}
