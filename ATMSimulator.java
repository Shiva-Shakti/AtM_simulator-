import java.util.Scanner;

class ATM {
    private double balance = 1000; // Default balance

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {1
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid Transaction!");
        }
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 1) atm.checkBalance();
            else if (choice == 2) {
                System.out.print("Enter Amount: ");
                atm.deposit(sc.nextDouble());
            } else if (choice == 3) {
                System.out.print("Enter Amount: ");
                atm.withdraw(sc.nextDouble());
            } else break;
        }
        sc.close();
    }
}
