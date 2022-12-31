package concreate;

import abstract_.CustomerService;
import entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to database: "+customer.getFirstName());
		
	}
	

}
