package by.gsu.beans;

public class ScienceBook extends Book {
	private String theme;
	private String complexity;
	
	public ScienceBook(String publisher, String author, int kol_pages, String theme, String complexity) {
		super(publisher, author, kol_pages);
		this.theme = theme;
		this.complexity = complexity;
	}

	public ScienceBook(String publisher, String author, int kol_pages) {
		super(publisher, author, kol_pages);
	}
	
	public ScienceBook(String publisher, String author, int kol_pages, String theme) {
		super(publisher, author, kol_pages);
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	@Override
	public String toString() {
		return "ScienceBook ["+ super.toString() +"theme=" + theme + ", complexity=" + complexity + "]";
	}
	
	@Override
	public void getName() {
		System.out.println("Science Book");
}
	
	

}
