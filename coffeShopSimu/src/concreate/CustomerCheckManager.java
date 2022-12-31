package concreate;

import abstract_.CustomerCheckServices;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckServices {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
