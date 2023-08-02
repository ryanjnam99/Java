public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        // this.account_total = checkingBalance + savingsBalance;
        totalMoney += checkingBalance + savingsBalance;
        accounts ++;
    }


    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckings() {
        return this.checkingBalance;
    }

    public void setCheckings(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    } 

    public double getSavings() {
        return this.savingsBalance;
    }

    public void setSavings(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccount() {
        return accounts;
    }


    public static void setAccount(int accounts) {
        accounts = accounts;
    }

    public static double getTotal() {
        return totalMoney;
    }

    public static void setTotal(double totalMoney) {
        totalMoney = totalMoney;
        
    }


    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositMoney(String account_type, double amount) {
        if (amount > 0){
            if( account_type.equals("checking")){
                checkingBalance += amount;
                System.out.println(amount + " " + "has been deposited into" + " " + account_type);
            }
            else if( account_type.equals("saving")){
                savingsBalance += amount;
                System.out.println(amount + " " + "has been deposited into" + " " + account_type);
            }
        }
        else {
            System.out.println("Amount must be greater than 0...");
        }
        this.totalMoney += amount;
        System.out.println("Your total money is:" + " " + totalMoney);

    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney(String account_type, double amount) {
        if (amount > 0) {
            if (account_type == "checking") {
                checkingBalance -= amount;
                System.out.println(amount + " " + "has been withdrawn" + " " + account_type);
            }
            else if (account_type == "saving") {
                checkingBalance -= amount;
                System.out.println(amount + " " + "has been withdrawn" + account_type);
            }
        }
        else {
            System.out.println("Enter an amount");
        }
        this.totalMoney -= amount;
        System.out.println("Your total money is:" + " " + totalMoney);
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("Checking Balance: $" + checkingBalance);
        System.out.println("Saving Balance: $" + savingsBalance);
        System.out.println("Total:" + " " + totalMoney);
    }
}
