package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.Utils.GoogleEmailManagerAdapter;
import eCommerce.dataAccess.concretes.inMemory.InMemoryUserDao;
import eCommerce.entities.concretes.User;
import eCommerce.googleEmail.GoogleEmailManager;

public class Main {

	public static void main(String[] args) {
		
		
				User merve=new User(4, "Merve", "Durmuþ", "merve@gmail.com", "123654", true);
				
				
				User selin = new User(2, "Selin", "Çiçek", "selin@gmail.com", "147258", false);
				
				
				InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
				GoogleEmailManagerAdapter googleEmailManagerAdapter = new GoogleEmailManagerAdapter(new GoogleEmailManager());
				
				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleEmailManagerAdapter));
				
				authManager.register(merve);
				UserManager userManager = new UserManager(inMemoryUserDao,googleEmailManagerAdapter);
				
				userManager.getAll();
				

	}

}
