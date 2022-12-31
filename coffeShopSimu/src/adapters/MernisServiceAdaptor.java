package adapters;

import abstract_.CustomerCheckServices;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckServices{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase()
					, customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		}
		catch(Exception e) {
			System.out.println("Girilen Bilgilerle Uyuþan Bir Vatandaþ Bulunmamaktadýr.");
		};
		
		
		
		
		
		
		return result;
	}
	


}
