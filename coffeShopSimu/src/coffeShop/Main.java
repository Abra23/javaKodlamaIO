package coffeShop;

import java.time.LocalDate;

import adapters.MernisServiceAdaptor;
import concreate.BaseCustomerManager;
import concreate.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		baseCustomerManager.add(new Customer(25, "üsame", "YILDIZ", LocalDate.of(1999,7,14), "13349084204"));	
	}

}
