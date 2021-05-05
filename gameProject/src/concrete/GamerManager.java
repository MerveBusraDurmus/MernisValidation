package concrete;

import abstract_.GamerCheckService;
import abstract_.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService ) {
		this.gamerCheckService=gamerCheckService;
	}
	@Override
	public void save(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Saved to db :" + gamer.getFirstName()+" "+ gamer.getLastName());
		}else {
			System.out.println("Not valid a person");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted to db :" + gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated to db :" + gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

}
