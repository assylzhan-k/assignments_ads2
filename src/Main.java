import java.util.LinkedList;
import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String username;
    double balance;

    public BankAccount(String accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
    }

    public void display() {
        System.out.println(username + " – Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Search by Username");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();

                    System.out.print("Enter username: ");
                    String name = sc.nextLine();

                    System.out.print("Enter balance: ");
                    double bal = sc.nextDouble();

                    accounts.add(new BankAccount(accNum, name, bal));
                    System.out.println("Account added successfully");
                    break;

                case 2:
                    System.out.println("Accounts List:");
                    int i = 1;
                    for (BankAccount acc : accounts) {
                        System.out.print(i + ". ");
                        acc.display();
                        i++;
                    }
                    break;

                case 3:
                    System.out.print("Enter username to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (BankAccount acc : accounts) {
                        if (acc.username.equalsIgnoreCase(searchName)) {
                            acc.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Account not found");
                    }
                    break;

                case 4: // Deposit
                    System.out.print("Enter username: ");
                    String depName = sc.nextLine();
                    boolean depFound = false;

                    for (BankAccount acc : accounts) {
                        if (acc.username.equalsIgnoreCase(depName)) {
                            System.out.print("Deposit: ");
                            double amount = sc.nextDouble();
                            sc.nextLine();

                            acc.balance += amount;
                            System.out.println("New balance: " + acc.balance);

                            depFound = true;
                            break;
                        }
                    }

                    if (!depFound) {
                        System.out.println("Account not found");
                    }
                    break;

                case 5: // Withdraw
                    System.out.print("Enter username: ");
                    String witName = sc.nextLine();
                    boolean witFound = false;

                    for (BankAccount acc : accounts) {
                        if (acc.username.equalsIgnoreCase(witName)) {
                            System.out.print("Withdraw: ");
                            double amount = sc.nextDouble();
                            sc.nextLine();

                            if (acc.balance >= amount) {
                                acc.balance -= amount;
                                System.out.println("New balance: " + acc.balance);
                            } else {
                                System.out.println("Insufficient balance");
                            }

                            witFound = true;
                            break;
                        }
                    }

                    if (!witFound) {
                        System.out.println("Account not found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}