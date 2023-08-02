public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(10.50, 5.50);
        BankAccount account2 = new BankAccount(5.65, 3.70);
        BankAccount account3 = new BankAccount(6.98, 9.27);
        // System.out.println(account1.getBalance());
        // System.out.println(account2.getBalance());

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.depositMoney("checking", 1.00);

        account2.depositMoney("saving", 1.00);

        account3.depositMoney("checking", 3.00);

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdrawMoney("checking", 2.75);

        account2.withdrawMoney("saving", 3.21);
        
        account3.withdrawMoney("checking", 3.75);


        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccount());
        System.out.println(BankAccount.getTotal());
    }
}
