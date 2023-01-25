/**
 * This service class is intended to contain the basic logic for deposits and withdrawls to a bank account
 * Separating menu logic and bank logic is good for two reasons: it makes both classes as simple
 * as they could be, and it also makes this class capable of being tested with automated tests, since testing
 * a class that receives user input is difficult.
 */

public class BankService {

    private double balance;

    public BankService() {
        this.balance = 0;
    }

    /**
     * TODO: implement functionality to increase the user's balance by amount.
     * @param amount the amount to be deposited.
     */

    public void deposit(double amount) {
        balance+=amount;
    }

    /**
     * TODO: implement functionality to decrease the user's balance by an amount.
     * If a withdrawl would result in the user having a negative balance, the withdrawl should not occur.
     * @param amount the amount to be withdrawn.
     */

    public void withdraw(double amount) {

        if(balance < amount) {
            System.out.println("Insufficient Funds");
        } else {
            balance-=amount;
        }

    }

    /**
     * TODO: return the balance.
     * @return the user's balance.
     */

    public double getBalance() {
        return balance;
    }

}
