package by.gsu.beans;

public class Book {
	private String publisher;
	private String author;
	private int kol_pages;
	
	public Book(String publisher, String author, int kol_pages) {
		super();
		this.publisher = publisher;
		this.author = author;
		this.kol_pages = kol_pages;
	}
	
	public Book(String publisher, String author) {
		super();
		this.publisher = publisher;
		this.author = author;
	}

	public Book() {
		super();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getKol_pages() {
		return kol_pages;
	}

	public void setKol_pages(int kol_pages) {
		this.kol_pages = kol_pages;
	}

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", author=" + author + ", kol_pages=" + kol_pages + "]";
	}
	
	public void getName() {
	System.out.println("Book");
	}
	
	

}
