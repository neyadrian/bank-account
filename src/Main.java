import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there na inital deposit (y/n)? ");
        char op = sc.next().charAt(0);

        Account account = new Account(accountNumber, holderName);

        if (op == 'y') {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account.deposit(value);
        }

        System.out.println("Accont data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);

        System.out.println("Update data:");
        System.out.println(account);



        sc.close();
    }
}