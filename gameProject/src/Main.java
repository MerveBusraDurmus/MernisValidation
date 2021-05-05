import adapters.MerniseServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"isim1","soyisim1","123456789",1990);
		
		Gamer gamer2 = new Gamer(2,"isim2","isim2","123456789",1994);
		
		Gamer gamer3 = new Gamer(3,"isim3","isim3","123456789",2000);
		
		//-------------------------------------
		
		Game game1 = new Game(1,"CSGO",120);
		
		Game game2 = new Game(2,"PUBG",79.95);
		
		Game game3 = new Game(3,"ETS2",111.15);
		
		//-------------------------------------
		
		Campaign campaign1 = new Campaign(1,"3 al 2 öde",25);
		
		Campaign campaign2 = new Campaign(2,"Yaz indirimi",10);
		
		Campaign campaign3 = new Campaign(3,"Kýþ indirimi",40);
		
		//-------------------------------------
		
		GamerManager gamerManager = new GamerManager(new MerniseServiceAdapter());
		gamerManager.save(gamer3);
		gamerManager.delete(gamer2);
		gamerManager.update(gamer1);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign3);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(game3, gamer2, campaign1);
		saleManager.sale(game2, gamer1);
		saleManager.sale(game1, gamer3);
		

	}

}
