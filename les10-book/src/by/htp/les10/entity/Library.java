package by.htp.les10.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<Book>();
	}
	
	public Library(Book[] books) {
		this.books = new ArrayList<Book>();
		for (int i = 0; i < books.length; i++) {
			this.books.add(books[i]);
		}
	}
	
	public void add(Book book) {
		books.add(book);
	}
	
	public List<Book> getBooks(){
		return books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}
	
}
