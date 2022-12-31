package concreate;

import abstarct_.ICampaignManager;
import entities.Campaign;

public class CampaignManager implements ICampaignManager {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Sisteme " + campaign.getName() + " isimli kampanya başarıyla eklenmiştir.");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Sistemden " + "'"+ campaign.getName()+"'" + " isimli kampanya silinmiştir");
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Sistemde bulunan " + campaign.getName() + " isimli kampanya güncellenmiştir.	" );
		
	}
	
	

}
