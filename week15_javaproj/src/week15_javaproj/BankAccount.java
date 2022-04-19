package week15_javaproj;
//final project- Dartmouth
//group Dan-Hanne (with Daniel Conroy)

public class BankAccount 
{
	private double balance; // Hold the amount in the account

	  // Creates an account with 0 balance.
	  public BankAccount() 
	  {
	    balance = 0.00;
	  }

	  // creates account w initial balance
	  public BankAccount(double initialAmount) 
	  {
	    balance = initialAmount;
	  }

	  //deposit into bank account
	  public void deposit(double amount) 
	  {
	    balance += amount;
	  }

	  //Withdraws from the bank account.
	  //Limitation: Does not test for an overdrawn account.
	  public void withdraw(double amount) 
	  {
	    balance -= amount;
	  }

	  /**
	   * @return the current balance in the account.
	   */
	  public double getBalance() 
	  {
	    return balance;
	  }

	  /**
	   * Transfers money from this bank account to other bank.
	   * @param other the bank account to transfer money to
	   * @param amount the amount to transfer
	   */
	  public void transfer(BankAccount other, double amount) 
	  {
	    withdraw(amount);
	    other.deposit(amount);
	  }
	  
	  //overrides toString provided by object class
	  public String toString() 
	  {
	    return "Account balance: " + balance;
	  }
	}
