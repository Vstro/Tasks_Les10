package by.htp.les10.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Book;
import by.htp.les10.entity.Library;

public class LibraryLogic {
	
	public List<Book> booksByAuthor(Library library, String author) {
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			
			if (book.getAuthors().equals(author)) {
				result.add(books.get(i));
			}
		}
		
		return result;
	}
	
	public List<Book> booksByPublisher(Library library, String publisher) {
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			
			if (book.getPublisher().equals(publisher)) {
				result.add(books.get(i));
			}
		}
		
		return result;
	}
	
	public List<Book> booksAfterYear(Library library, int year) {
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			
			if (book.getYear() > year) {
				result.add(books.get(i));
			}
		}
		
		return result;
	}

}
