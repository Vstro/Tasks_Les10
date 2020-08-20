package by.htp.les10.main;

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerBook;
import by.htp.les10.logic.CustomerBookLogic;
import by.htp.les10.view.CustomerBookViewver;

public class Main {

	public static void main(String[] args) {
		CustomerBook cb = new CustomerBook();
		CustomerBookLogic logic = new CustomerBookLogic();
		CustomerBookViewver view = new CustomerBookViewver();
		
		cb.add(new Customer(7, "Petrov N. V.", "Olgy Solomovoj 45, Grodno, Belarus", 4436, 324));
		cb.add(new Customer());
		cb.add(new Customer(2, "Ivanov A. P.", "Belye Rosy 23, Grodno, Belarus", 1234, 101));
		
		view.printAll("Just all customers:", cb);
		
		view.printAll("All customers sorted alphabetically:", logic.alphabetSorted(cb));
		
		view.printAll("Customers with credit card numbers from 1000 to 4000:", logic.creditCardNumbersInInterval(cb, 1000, 4000));

	}

}
