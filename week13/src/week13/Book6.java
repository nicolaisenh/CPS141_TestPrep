package week13;

public class Book6
{
	String title;
	String author;
	int numOfPages;
	String ISBN;

	Book6(String tit, String aut, int num)
	{
		title = tit; author = aut; numOfPages = num;
		ISBN = "unkown";
	}
	
	Book6(String tit, String aut, int num, String isbn)
	{
		title = tit; author = aut; numOfPages = num;
		ISBN = isbn;
	}
	
	public String getIntls()
	{
		String intls = "";
		for(int i = 0; i < author.length(); i++)
		{
			char curChar = author.charAt(i);
			if(curChar >= 'A' && curChar <= 'Z')
				intls = intls + curChar + '.';
		}
		return intls;
	}
}

class ExBook6
{
	public static void main(String[] args)
	{
		Book6 b1, b2;
		
		b1 = new Book6("Thinking in Java", "Bruce Eckel",1129);
		b2 = new Book6("Thinking in Java", "Bruce Eckel", 1129);
		
		if(b1 == b2)
			System.out.println("The two books are the same");
		else
			System.out.println("The two books are different.");
	}
}