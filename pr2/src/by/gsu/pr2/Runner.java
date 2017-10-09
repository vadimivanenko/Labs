package by.gsu.pr2;

import by.gsu.beans.AtrBook;
import by.gsu.beans.Book;
import by.gsu.beans.ScienceBook;

public class Runner {

	public static void main(String[] args) 
	{
		Book[] book = new Book[3];
		AtrBook[] art_book = new AtrBook[3];
		ScienceBook[] science_book = new ScienceBook[3];
		book[0]= new Book("Book_One","Author_One",150);
		book[1]= new Book("Book_Two","Author_Two",350);
		book[2]= new Book("Book_Three","Author_Three",250);
		art_book[0] = new AtrBook("Art_Book_One","Art_Author_One",100,"Classic");
		art_book[1] = new AtrBook("Art_Book_Two","Art_Author_Two",50,"Russian");
		art_book[2] = new AtrBook("Art_Book_Three","Art_Author_Three",300,"Fiction");
		science_book[0] = new ScienceBook("Science_Book_One","Science_Author_One",150,"Physics","Heavy");
		science_book[1] = new ScienceBook("Science_Book_Two","Science_Author_Two",200,"Math","Easy");
		science_book[2] = new ScienceBook("Science_Book_Three","Science_Author_Three",300,"Philosophy","Heavy");
		for (int i =0;i<3;i++)
		{
			System.out.println(book[i].toString());
			System.out.println(art_book[i].toString());
			System.out.println(science_book[i].toString());
		}
	}

}
