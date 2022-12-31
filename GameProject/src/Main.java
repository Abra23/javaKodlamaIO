import concreate.CampaignManager;
import concreate.GameManager;
import concreate.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**********Kullan�c� ��lemeleri************");
		
		User user1 = new User(1,"�same","YILDIZ","12345","14-07-1999"); 
		User user2 = new User(2,"Usame","y�ld�z","1234","12-11-1988");
		
		UserManager userManager = new UserManager();
		userManager.checkIfRealPerson(user1); // Ba�ar�l�
		userManager.checkIfRealPerson(user2); // ba�ar�s�z
		
		UserManager userManager2 = new UserManager();
		userManager2.checkIfRealPerson(user2); // ba�ar�s�z
		userManager2.signUp(user2); // kay�t edildi.
				
		
		Game game = new Game();
		Game game2 = new Game("Pes",150,100,20);
		game.setGameName("Fifa");
		game.setGamePrice(100);
		game.setGameDiscount(10);
		game.setGameStock(5);
		
		System.out.println("***********indirim eklmee*********");
		
		Campaign campaign = new Campaign(1,"Yaz �ndirim",10,1500);
		CampaignManager campaignManager1 = new CampaignManager();
		campaignManager1.campaignAdd(campaign);
				
		GameManager gameManager = new GameManager();
		gameManager.sell(user1, campaign, game);
		gameManager.sell(user2, campaign, game2);
		
		
		
		
		
		
		
		
	}

}
