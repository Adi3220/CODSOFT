//TASK-3:ATM
import java.util.*;

class ATM {
    private bankAcc userAcc;

    public ATM(bankAcc acc) {
        this.userAcc = acc;
    }

    public void menu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void process(int opt) {
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid opt. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Current balance: $" + userAcc.getBalance());
    }

    private void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amt: ");
        double amt = scanner.nextDouble();

        if (amt > 0) {
            userAcc.deposit(amt);
            System.out.println("Deposit successful. New balance: $" + userAcc.getBalance());
        } else {
            System.out.println("Invalid deposit amt.");
        }
    }

    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amt: ");
        double amt = scanner.nextDouble();

        if (amt > 0 && amt <= userAcc.getBalance()) {
            userAcc.withdraw(amt);
            System.out.println("Withdrawal successful. Remaining balance: $" + userAcc.getBalance());
        } else {
            System.out.println("Invalid withdrawal amt or insufficient funds.");
        }
    }
}

class bankAcc {
    private double balance;

    public bankAcc(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}

public class codsoft_3 {
    public static void main(String[] args) {
        bankAcc userAcc = new bankAcc(1000.0);
        ATM atm = new ATM(userAcc);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.menu();
            System.out.print("Choose an opt: ");
            int opt = scanner.nextInt();
            atm.process(opt);
        }
    }
}
