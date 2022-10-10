package Practical1;
/*ID: 21ce047
Name: Akshit Joshi
AIM : Design a class named Account that contains:
     •A private int data field namedid for the account (default 0).
     •A private double data field named balance for the account (default 0).
     •A  private  double  data  field  named  annualInterestRate  that  stores  
      the  currentinterest rate (default 0).
      Assume all accounts have the same interest rate.
     •A  private  Date  data  field  named  dateCreated  that  stores  the  
      date  when  theaccount was created.
     •A no-arg constructor that creates a default account.
     •A constructor that creates an account with the specified id and initial 
      balance.
     •The accessor and mutator methods for id, balance, and annualInterestRate.
     •The accessor method for dateCreated.
     •A method named getMonthlyInterestRate() that returns the monthlyinterest 
      rate.
     •A method named getMonthlyInterest() that returns the monthly interest.
     •A method named withdraw that withdraws a specified amount from theaccount.
     •A method named deposit that deposits aspecified amount to the account.*/

     
     public class Account{
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private String dateCreated= "20/10/2003";
    
        {
            annualInterestRate = 7;
        }
    
        public Account() {
            balance = 500;
        }
    
        public Account(int id, double balance)
        {
            this.id = id;
            this.balance= balance;
        }
    
        public void setBalance(double balance) {
            this.balance = balance;
        }
    
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
    
        public void setId(int id) {
            this.id = id;
        }
        public void setDateCreated(String dateCreated){
            this.dateCreated=dateCreated;
        }
    
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public String getDateCreated() {
            return dateCreated;
        }
    
        public int getId() {
            return id;
        }
    
        public double getMonthlyInterestRate()
        {
            return annualInterestRate/12;
        }
    
        public double getMonthlyInterest()
        {
            return balance*(annualInterestRate/1200);
        }
    
        public double withdraw(double a)
        {
            if(a<balance)
                balance-=a;
            else
                System.out.println("Insufficient balance");
            return balance;
        } 
    
        public double deposit(double a)
        {
            balance+=a;
            return balance;
        }
    }