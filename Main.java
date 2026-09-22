import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount("Juan Dela Cruz",
                1001, 10000, 0.5);
        savings.deposit(2000);
        savings.applyInterest();
        savings.displayInfo();


        CurrentAccount current = new CurrentAccount("Maria Santos",
                1002, 15000);

        current.withdraw(-2000);
        current.displayInfo();
    }
}
