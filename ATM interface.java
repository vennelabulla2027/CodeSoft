import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        while (true) {
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Deposit Amount: ");
                    balance += sc.nextDouble();
                    System.out.println("Money Deposited.");
                    break;

                case 3:
                    System.out.print("Withdraw Amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance) {
                        balance -= amt;
                        System.out.println("Please collect cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}