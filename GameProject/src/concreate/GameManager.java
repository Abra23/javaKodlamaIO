package concreate;

import entities.Campaign;
import entities.Game;
import entities.User;

public class GameManager extends CampaignManager {
	
	public void sell(User user,Campaign campaign,Game game) {
		System.out.println(user.getFirstName() + " isimli kullan�c� "+ game.getGameName() + " ismindeki oyunu "+campaign.getName()+" kampanyas�yla %" 
	+ game.getGameDiscount() + " indirimle " + game.getGamePriceAfterDiscount()
		+ " fiyat�yla sat�n alm��t�r.");
	}

}
