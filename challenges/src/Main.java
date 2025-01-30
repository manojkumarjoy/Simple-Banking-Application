public class Main {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount(001,"Manoj",1000);
        customer.deposit(1000);
        System.out.println("Your account balance is : "+ customer.getAccountBalance());
        customer.withdraw(200);
        System.out.println("Your account balance is : "+ customer.getAccountBalance());
    }
}