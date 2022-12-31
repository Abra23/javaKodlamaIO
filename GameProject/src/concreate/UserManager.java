package concreate;

import abstarct_.CheckUserManager;
import entities.User;

public class UserManager implements CheckUserManager {
	
	
	
	public void signUp(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� kay�t edildi.");
		
	}
	
	
	public void signIn(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c�  giri� yapt�.");
		
	}
	
	
	public void signUpdate(User user) {
		
		System.out.println(user.getFirstName()+" isimli kullan�c� g�ncellendi.");
	}
	
	
	

	@Override
	public void checkIfRealPerson(User user) {
		if (user.getId()==1 && user.getFirstName()=="�same" && user.getLastName()=="YILDIZ" && user.getNationalityId() =="12345" 
				&& user.getDayOfBirth()=="14-07-1999") 
		{
			System.out.println(user.getFirstName() + " isimli kullan�c� ba�ar�yla giri� yapt�.");
		}
		
		else {
			System.out.println("Bahsedilen ki�i sisteme kay�tl� de�ildir.");
		}
		
		
		
		
		
	}

}
