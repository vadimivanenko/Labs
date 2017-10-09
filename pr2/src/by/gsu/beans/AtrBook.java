package by.gsu.beans;

public class AtrBook extends Book {
	private String genre;

	
	public AtrBook(String publisher, String author, int kol_pages, String genre) {
		super(publisher, author, kol_pages);
		this.genre = genre;
	}
	
	public AtrBook(String publisher, String author, int kol_pages) {
		super(publisher, author, kol_pages);
	}
	
	public AtrBook(String publisher, String author, String genre) {
		super(publisher, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
		public void getName() {
			System.out.println("Art Book");
	}

	@Override
	public String toString() {
		return "AtrBook [ getPublisher()=" + getPublisher() + ", getAuthor()="
				+ getAuthor() + ", getKol_pages()=" + getKol_pages() + "getGenre()=" + getGenre() + "]";
	}

	
	
	

}
