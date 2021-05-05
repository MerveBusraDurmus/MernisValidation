package concrete;

import abstract_.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println(game.getName() + " adl� oyun " + 
		gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu taraf�ndan sat�n al�nd�.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		
		double reducedPrice= game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100);
		System.out.println(game.getName() +" adl� oyun "+
		gamer.getFirstName()+ " "+ gamer.getLastName() +" isimli oyuncu taraf�ndan %"+
				campaign.getDiscountRate()+" indirimle " + reducedPrice + " fiyata sat�n al�nd�");
		
	}

}
