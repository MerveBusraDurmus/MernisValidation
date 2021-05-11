package eCommerce.dataAccess.concretes.inMemory;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	
	private List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		
		User user1 = new User(1,"Merve","Çiçek","merve@gmail.com","123456",true);
		User user2 = new User(2,"Rümeysa","Derin","rümeysa@gmail.com","123456",true);
		User user3 = new User(3,"Ali","Mutlu","ali@gmail.com","123456",true);
		
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
	}
	
	
	
	
	
	
	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Eklendi : "+ user.getFirtName()+ " "+ user.getLastName());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate=users.stream().filter(u->u.getId()==user.getId()).findFirst().orElse(null);
		userToUpdate.seteMail(user.geteMail());
		userToUpdate.setFirtName(user.getFirtName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
		
	}

	@Override
	public void delete(int userId) {
		
		User userToDelete = users.stream().filter(u->u.getId()==userId).findFirst().orElse(null);
		
		users.remove(userToDelete);
		
	}

	@Override
	public User get(String email) {
		
		User user = users.stream().filter(u->u.geteMail()==email).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
