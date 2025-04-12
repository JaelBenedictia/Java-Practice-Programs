public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Jael Benedictia", 123456, 3000);
        acc.displayDetails();
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayDetails();
    }
}