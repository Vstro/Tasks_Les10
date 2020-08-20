package by.htp.les10.main;

import by.htp.les10.entity.Book;
import by.htp.les10.entity.Library;
import by.htp.les10.logic.LibraryLogic;
import by.htp.les10.view.LibraryViewver;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		LibraryLogic logic = new LibraryLogic();
		LibraryViewver view = new LibraryViewver();
		
		lib.add(new Book());
		lib.add(new Book(1, "Alice in Wonderland", "Lewis Carroll", "Rasvet", 2015, 80, 40, "Hard"));
		lib.add(new Book(2, "Harry Potter", "J. K. Rowling", "Eksmo", 2016, 90, 45, "Hard"));
		
		view.printAll("Just all books:", lib);
		
		view.printAll("All books of Lewis Carroll:", logic.booksByAuthor(lib, "Lewis Carroll"));
		
		view.printAll("All books of The Eksmo publisher:", logic.booksByPublisher(lib, "Eksmo"));
		
		view.printAll("All books published after 2015:", logic.booksAfterYear(lib, 2015));

	}

}
