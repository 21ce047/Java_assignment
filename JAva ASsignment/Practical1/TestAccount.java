package Practical1;

public class TestAccount {
    public static void main(String[] args) {

        Account Ac = new Account(047, 18000);
        Ac.setAnnualInterestRate(7.5);
        Ac.withdraw(4000);
        Ac.deposit(2000);
        Ac.setDateCreated("2/10/2005");

        System.out.println("Balance: " + Ac.getBalance());
        System.out.println("Monthly Interest: " + Ac.getMonthlyInterest());
        System.out.println("Date Created: " + Ac.getDateCreated());

    }

}