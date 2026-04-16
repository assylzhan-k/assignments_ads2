import java.util.*;
public class Task4_Main {
    public static void main(String[] args) {
        Queue<String> bills = new LinkedList<>();
        bills.add("Electricity Bill");
        bills.add("Internet Bill");
        System.out.println("Processing: " + bills.poll());
        System.out.println("Remaining: " + bills);
    }
}