package by.htp.les10.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerBook;

public class CustomerBookLogic {
	
	public List<Customer> alphabetSorted(CustomerBook customerBook) {		
		List<Customer> customers = customerBook.getCustomers();
		
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getFIO().compareTo(o2.getFIO());
			}
		});
		
		return customers;
	}
	
	public List<Customer> creditCardNumbersInInterval(CustomerBook customerBook, int minNum, int maxNum) {
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = customerBook.getCustomers();
		
		for (int i = 0; i < customers.size(); i++) {
			if ((customers.get(i).getCreditCardNumber() >= minNum) && (customers.get(i).getCreditCardNumber() <= maxNum)) {
				result.add(customers.get(i));
			}
		}
		
		return result;
	}

}
