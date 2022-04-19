package week15_javaproj;
//final project- Dartmouth
//group Dan-Hanne

public class AccountTest2 
{
	  public static void main(String[] args) 
	  {
	    BankAccount momsSavings = new SavingsAccount(0.5);
	    BankAccount collegeFund = new TimeDepositAccount(1.0, 10000.00, 3, 0.5);
	    BankAccount harrysChecking = new CheckingAccount();

	    momsSavings.deposit(10000.00);

	    momsSavings.transfer(harrysChecking, 2000);

	    harrysChecking.withdraw(200);
	    harrysChecking.withdraw(300);
	    harrysChecking.withdraw(80);
	    harrysChecking.withdraw(400);

	    endOfMonth((SavingsAccount) momsSavings);
	    endOfMonth((TimeDepositAccount) collegeFund);
	    endOfMonth((CheckingAccount) harrysChecking);

	    collegeFund.transfer(harrysChecking, 980);

	    System.out.println("Mom's savings. " + momsSavings);
	    // (10000 - 2000) * .5 % interest = 8040
	    System.out.println("The college fund. " + collegeFund);
	    // (10000 * 1% interest) * 0.5% penalty - 980 = 9069.50
	    System.out.println("Harry's checking. " + harrysChecking);
	    // 2000 - 200 - 300 - 80 - 400 - 2 trans. fees + 980 = 1999
	  }

	  // Handle end-of-month operations. Overloaded method, because
	  // checking account does different things than savings account.

	   
	   //Handles end of month interest for a savings account

	  public static void endOfMonth(SavingsAccount savings) 
	  {
	    savings.addPeriodicInterest();
	  }

	  //Handles end of month fee deduction for a checking account
	  public static void endOfMonth(CheckingAccount checking) 
	  {
	    checking.deductFees();
	  }
	}