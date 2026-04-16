import java.util.*;
class BankAccount {
    String name;
    double balance;
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add 2.Show 3.Deposit 4.Withdraw 5.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Balance: ");
                double bal = sc.nextDouble();
                accounts.add(new BankAccount(name, bal));
            }
            else if (ch == 2) {
                for (BankAccount a : accounts)
                    System.out.println(a.name + " - " + a.balance);
            }
            else if (ch == 3) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                for (BankAccount a : accounts) {
                    if (a.name.equals(name)) {
                        System.out.print("Deposit: ");
                        a.balance += sc.nextDouble();
                        System.out.println("New: " + a.balance);
                    }
                }
            }
            else if (ch == 4) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                for (BankAccount a : accounts) {
                    if (a.name.equals(name)) {
                        System.out.print("Withdraw: ");
                        double x = sc.nextDouble();
                        if (a.balance >= x) {
                            a.balance -= x;
                            System.out.println("New: " + a.balance);
                        } else {
                            System.out.println("Not enough money");
                        }
                    }
                }
            }
            else if (ch == 5) break;
        }
    }
}