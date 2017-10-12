package by.gsu.pr2;

import by.gsu.beans.AtrBook;
import by.gsu.beans.Book;
import by.gsu.beans.ScienceBook;

public class Runner {

	public static void main(String[] args) 
	{
		Book[] book = new Book[9];
		book[0]= new Book("Book_One","Author_One",150);
		book[1]= new Book("Book_Two","Author_Two",350);
		book[2]= new Book("Book_Three","Author_Three",250);
		book[3] = new AtrBook("Art_Book_One","Art_Author_One",100,"Classic");
		book[4] = new AtrBook("Art_Book_Two","Art_Author_Two",50,"Russian");
		book[5] = new AtrBook("Art_Book_Three","Art_Author_Three",300,"Fiction");
		book[6] = new ScienceBook("Science_Book_One","Science_Author_One",150,"Physics","Heavy");
		book[7] = new ScienceBook("Science_Book_Two","Science_Author_Two",200,"Math","Easy");
		book[8] = new ScienceBook("Science_Book_Three","Science_Author_Three",300,"Philosophy","Heavy");
		for (int i =0;i<book.length;i++)
		{
			System.out.println(book[i].toString());
		}
	}
}
