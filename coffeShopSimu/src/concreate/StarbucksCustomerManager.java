package concreate;

import abstract_.CustomerCheckServices;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckServices customerCheckServices;
	
	
	public StarbucksCustomerManager(CustomerCheckServices customerCheckServices) {
		this.customerCheckServices=customerCheckServices;
	}


	@Override
	public void add(Customer customer) {
		
		if(customerCheckServices.checkIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Böyle Bir Vatandaþ Yok.");
		}
		
	}
	

}
