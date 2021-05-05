package abstract_;

import entities.Gamer;

public interface GamerService {
	 void save(Gamer gamer);
     void delete(Gamer gamer);
     void update(Gamer gamer);
}
