package concreate;

import abstarct_.CheckUserManager;
import entities.User;

public class UserManager implements CheckUserManager {
	
	
	
	public void signUp(User user) {
		System.out.println(user.getFirstName()+" isimli kullanýcý kayýt edildi.");
		
	}
	
	
	public void signIn(User user) {
		System.out.println(user.getFirstName()+" isimli kullanýcý  giriþ yaptý.");
		
	}
	
	
	public void signUpdate(User user) {
		
		System.out.println(user.getFirstName()+" isimli kullanýcý güncellendi.");
	}
	
	
	

	@Override
	public void checkIfRealPerson(User user) {
		if (user.getId()==1 && user.getFirstName()=="Üsame" && user.getLastName()=="YILDIZ" && user.getNationalityId() =="12345" 
				&& user.getDayOfBirth()=="14-07-1999") 
		{
			System.out.println(user.getFirstName() + " isimli kullanýcý baþarýyla giriþ yaptý.");
		}
		
		else {
			System.out.println("Bahsedilen kiþi sisteme kayýtlý deðildir.");
		}
		
		
		
		
		
	}

}
