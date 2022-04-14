package week13.take_home_test;
import java.util.*;

public class Employee 
{	
		String firstName;
		String lastName;
		int balance;
		int fBalance;
		
		Employee(String first, String last, int bal)
		{
			firstName = first;
			lastName = last;
			balance = bal;	
			fBalance = 0;
		}	
		
		//includes a final balance (not yet known)
		Employee(String first, String last, int bal, int fBal)
		{
			firstName = first;
			lastName = last;
			balance = bal;
			fBalance = fBal;
		}

		public String getIntls()
		{
			String intls = "";
			String intlsFN = "";
			//String intlsLN= "";
			
			
			for(int i = 0; i < firstName.length();i++)
			{
				char curChar = firstName.charAt(i);
				if(curChar >= 'A' && curChar <= 'Z')
					intlsFN = intlsFN + curChar + '.';
			
				for(int j = 0; j < lastName.length();j++)
				{
					char curCharLN = lastName.charAt(j);
					if(curCharLN >= 'A' && curCharLN <= 'Z')
						intls = intlsFN + curCharLN + '.';
				}
			}
			           
			return intls;
		}
}
		
		class EmployeeIntls
		{
			public static void main (String[] args)
			{
				//will print initials and balance (like book4 plus balance)
				Employee e;
				e = new Employee("Hanne","Nicolaisen",393);
				System.out.print("Initials: " + e.getIntls() + "\nBalance: " + e.balance);
				System.out.println();

				//array like book5 (plus print balance)
				Employee[] em = new Employee[3];
				em[0] = new Employee("Hanne", "Nicolaisen", 393);
				em[1]= new Employee("Daniel", "Conroy", 329);
				em[2]= new Employee("Melanie", "Taylor", 354);
				
				System.out.println();
				
				for(int i = 0; i < em.length; i++)
					System.out.println("Initials: " + em[i].getIntls() + "\nBalance: " + em[i].balance);
				
				//array like book6
				Employee em1, em2;

				em1 = new Employee("Sabrina", "Lin", 275);
				em2 = new Employee("Eric", "Luna", 243);
				
				System.out.println();
				if(em1 == em2)
					System.out.println("The two employees are the same");
				else
					System.out.println("The two employees are different");	
			}
		}