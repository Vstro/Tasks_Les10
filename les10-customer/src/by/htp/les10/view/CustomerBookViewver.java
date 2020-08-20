package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerBook;

public class CustomerBookViewver {

	public void printAll(String message, List<Customer> customers) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);			
			System.out.println(customer.toString());
		}
	}
	
	public void printAll(String message, CustomerBook customerBook) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		List<Customer> customers = customerBook.getCustomers();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);			
			System.out.println(customer.toString());
		}
	}

}
