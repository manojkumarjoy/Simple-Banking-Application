public class BankAccount extends Account {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(int accountNumber,String accountHolderName,double accountBalance){
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        System.out.println("Your account is succesfully created...");
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public void deposit(double amount){
        this.accountBalance += amount;
        System.out.println("your money is succesfully credited");
    }
    @Override
    public double withdraw(double amount){
        if(amount > this.accountBalance){
            System.out.println("invalid balance");
            return -1;
        }else {
            this.accountBalance -= amount;
            System.out.println("your money is sucessfully debited ");
            return amount;
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account holder Name : "+accountHolderName);
        System.out.println("Account holder AccNumber : "+accountNumber);
        System.out.println("Account holder balance : "+accountBalance);
    }
}
