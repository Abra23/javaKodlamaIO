package abstarct_;

import entities.Campaign;

public interface ICampaignManager {
	void campaignAdd(Campaign campaign);
	
	void campaignDelete(Campaign campaign);
	
	void campaignUpdate(Campaign campaign);

}
