package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Book;
import by.htp.les10.entity.Library;

public class LibraryViewver {

	public void printAll(String message, List<Book> books) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);			
			System.out.println(book.toString());
		}
	}
	
	public void printAll(String message, Library library) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		List<Book> books = library.getBooks();
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);			
			System.out.println(book.toString());
		}
	}

}
