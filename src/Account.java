public class Account {

    public int accountNumber;
    public String holderName;
    public double currentBalance = 0.0;

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void deposit(double value) {
        if (value > 0.0) {
            currentBalance = currentBalance + value;
        } else {
            System.out.println("Invalid value.");
        }
    }

    public void withdraw(double value) {
        if (value > 0.0 && value <= currentBalance) {
            currentBalance = currentBalance - value - 5.0;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public String toString() {
        return  "Account " + accountNumber +
                ", Holder: " + holderName +
                ", Balance: " + currentBalance + "\n";
    }
}
