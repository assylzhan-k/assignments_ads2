import java.util.*;
public class Task5_Main {
    public static void main(String[] args) {
        Queue<BankAccount> requests = new LinkedList<>();
        LinkedList<BankAccount> accounts = new LinkedList<>();
        requests.add(new BankAccount("Ali", 0));
        requests.add(new BankAccount("Sara", 0));
        System.out.println("Processing request...");
        BankAccount a = requests.poll();
        accounts.add(a);
        System.out.println("Approved: " + a.name);
    }
}