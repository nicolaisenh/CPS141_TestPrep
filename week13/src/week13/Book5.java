package week13;

public class Book5 
{
	String title;
	String author;
	int numOfPages;
	String ISBN;

	Book5(String tit, String aut, int num)
	{
		title = tit; author = aut; numOfPages = num;
		ISBN = "unkown";
	}
	
	Book5(String tit, String aut, int num, String isbn)
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

class ExBook5
{
	public static void main(String[] args)
	{
		Book5[] a = new Book5[3];
		a[0] = new Book5("Thinking in Java", "Bruce Eckel", 1129);
		a[1] = new Book5("Java in a nutshell", "David Flanagan", 353);
		a[2] = new Book5("Java network programming", "Elliot Rusty Harold", 649);
		
		for(int i = 0; i < a.length; i++)
			System.out.println("Initials : " + a[i].getIntls());	
	}
}

