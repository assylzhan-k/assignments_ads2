import java.util.*;
public class Final {
    static LinkedList<BankAccount> accounts = new LinkedList<>();
    static Stack<String> history = new Stack<>();
    static Queue<String> bills = new LinkedList<>();
    static Queue<BankAccount> requests = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static BankAccount find(String name) {
        for (BankAccount a : accounts)
            if (a.name.equalsIgnoreCase(name))
                return a;
        return null;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Bank 2.ATM 3.Admin 4.Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.println("1.Request 2.Deposit 3.Withdraw");
                int b = sc.nextInt(); sc.nextLine();
                if (b == 1) {
                    System.out.print("Name: ");
                    requests.add(new BankAccount(sc.nextLine(), 0));
                }
                else if (b == 2) {
                    System.out.print("Name: ");
                    BankAccount a = find(sc.nextLine());
                    if (a != null) {
                        System.out.print("Deposit: ");
                        double x = sc.nextDouble();
                        a.balance += x;
                        history.push("Deposit " + x);
                    }
                }
                else if (b == 3) {
                    System.out.print("Name: ");
                    BankAccount a = find(sc.nextLine());
                    if (a != null) {
                        System.out.print("Withdraw: ");
                        double x = sc.nextDouble();
                        if (a.balance >= x) a.balance -= x;
                    }
                }
            }
            else if (ch == 2) {
                System.out.print("Name: ");
                BankAccount a = find(sc.nextLine());
                if (a != null)
                    System.out.println("Balance: " + a.balance);
            }
            else if (ch == 3) {
                if (!requests.isEmpty())
                    accounts.add(requests.poll());

                System.out.println("Bills: " + bills);
            }
            else break;
        }
    }
}