package week13;

public class Book4 
{
	String title;
	String author;
	int numOfPages;
	String ISBN;

	Book4(String tit, String aut, int num)
	{
		title = tit; author = aut; numOfPages = num;
		ISBN = "unkown";
	}
	
	Book4(String tit, String aut, int num, String isbn)
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

class ExBook4
{
	public static void main (String[] args)
	{
		Book4 bk;
		bk = new Book4("Thinking in Java", "Bruce Eckel", 1129);
		System.out.println("Initials: " + bk.getIntls());
	}
}