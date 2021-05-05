package concrete;

import abstract_.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated");
		
	}

}
