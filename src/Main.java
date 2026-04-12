import java.util.*;
class BankAccount {
    int accNum;
    String name;
    double balance;
    BankAccount(int accNum, String name, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<BankAccount> list = new LinkedList<>();
        list.add(new BankAccount(1, "Ali", 150000));
        list.add(new BankAccount(2, "Sara", 220000));
        System.out.println("Accounts List:");
        int i = 1;
        for (BankAccount acc : list) {
            System.out.println(i++ + ". " + acc.name + " – Balance: " + acc.balance);
        }
        String search = "Ali";
        for (BankAccount acc : list) {
            if (acc.name.equalsIgnoreCase(search)) {
                System.out.println("Found: " + acc.name);
            }
        }
    }
}