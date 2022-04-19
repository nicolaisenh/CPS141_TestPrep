package week15_javaproj;
//final project- Dartmouth
//group Dan-Hanne

public class SavingsAccount extends BankAccount 
{
	  // balance is inherited from BankAccount, but is not directly accessible (private)
	  // Methods deposit, withdraw, getBalance, transfer, and toString are inherited, and are directly accessible (public)

	  private double interestRate; // Holds the interest rate for the period.

	  
	   //Constructor that sets interest rate.
	  public SavingsAccount(double rate) 
	  {
	    // Because no call to super is made in the first line, the default
	    // constructor for BankAccount is automatically called here.

	    interestRate = rate;
	  }

	   // Constructor that sets rate and initial balance.
	  public SavingsAccount(double rate, double initialAmount) 
	  {
	    super(initialAmount);  // Calls constructor for BankAccount.
	    interestRate = rate;
	  }

	  
	   //Add interest for the current period to the account balance.
	   
	  public void addPeriodicInterest() 
	  {
	    double interest = getBalance() * interestRate / 100.0;
	    deposit(interest);
	  }
	}