import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there na inital deposit (y/n)? ");
        char op = sc.next().charAt(0);

        Account account = new Account(accountNumber, holderName);

        if (op == 'y') {
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account.deposit(value);
        }


        sc.close();
    }
}