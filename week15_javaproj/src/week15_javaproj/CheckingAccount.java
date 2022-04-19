package week15_javaproj;
//final project- Dartmouth
//group Dan-Hanne

public class CheckingAccount extends BankAccount 
{
	  //balance is inherited/ not directly accessible
	  private static final int FREE_TRANSACTIONS = 3;
	  private static final double TRANSACTION_FEE = 0.50;
	  private int transactionCount; 

	  //default constructor - 0 balance account
	  public CheckingAccount() {
	    transactionCount = 0;
	  }

	 //constructor - initial balance
	  public CheckingAccount(double initialAmount) 
	  {
	    super(initialAmount);
	    transactionCount = 0;
	  }

	  // Methods getBalance, transfer, and toString are inherited.
	  // Methods withdraw and deposit from the superclass fail to take into
	  // account transaction counts, and so they need to be overridden.


	   //Withdraw from account, but count as a transaction.
	  public void withdraw(double amount) 
	  {
	    super.withdraw(amount);
	    transactionCount++;
	  }

	   //Deposit to account, but count as a transaction.
	  public void deposit(double amount) 
	  {
	    super.deposit(amount);
	    transactionCount++;
	  }

	   //Charge transaction fees (if any) to the account
	  public void deductFees() 
	  {
	    if (transactionCount > FREE_TRANSACTIONS) 
	    {
	      double fee = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
	      super.withdraw(fee);
	    }
	    transactionCount = 0; // Start over because new time period.
	  }
	}