package by.htp.les10.entity;

public class Book{
	private int id;
	private String title;
	private String authors;
	private String publisher;
	private int year;
	private int pages;
	private int price;
	private String coverType;

	public Book() {
		this.id = 0;
		this.title = "Unknown";
		this.authors = "Anonymous";
		this.publisher = "Unknown";
		this.year = 2000;
		this.pages = 100;
		this.price = 50;
		this.coverType = "Soft";
	}
	
	public Book(int id, String title, String authors, String publisher, int year, int pages, int price, String coverType) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return "Book [" + id + "] \"" + title + "\", authors - " + authors + ", publisher - " + publisher + ", year - "
				+ year + ", pages - " + pages + ", price - " + price + ", coverType - " + coverType;
	}

}
