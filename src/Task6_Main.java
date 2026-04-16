public class Task6_Main {
    public static void main(String[] args) {
        BankAccount[] arr = new BankAccount[3];
        arr[0] = new BankAccount("Ali", 100000);
        arr[1] = new BankAccount("Sara", 200000);
        arr[2] = new BankAccount("John", 150000);
        for (BankAccount a : arr)
            System.out.println(a.name + " - " + a.balance);
    }
}