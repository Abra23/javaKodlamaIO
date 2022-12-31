package concreate;

import entities.Campaign;
import entities.Game;
import entities.User;

public class GameManager extends CampaignManager {
	
	public void sell(User user,Campaign campaign,Game game) {
		System.out.println(user.getFirstName() + " isimli kullanýcý "+ game.getGameName() + " ismindeki oyunu "+campaign.getName()+" kampanyasýyla %" 
	+ game.getGameDiscount() + " indirimle " + game.getGamePriceAfterDiscount()
		+ " fiyatýyla satýn almýþtýr.");
	}

}
