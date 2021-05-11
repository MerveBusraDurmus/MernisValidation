package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.EmailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;
	
	public UserManager(UserDao userDao ,  EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService=emailService;
	}

	@Override
	public void add(User user) {
		
		userDao.add(user);
		
	}

	@Override
	public void add(String email) {
		
		User user = new User();
		user.seteMail(email);
		userDao.add(user);
		System.out.println("Log2 : "+ user.geteMail());
		emailService.send(email, "Kayýt oldunuz");
		
		
	}

	@Override
	public void update(User user) {
		
		if(userValidate(user)) {
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(int userId) {
		
		userDao.delete(userId);
		
	}

	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	
	public boolean userValidate(User user) {
		if(user.getFirtName().length()>2 && user.getLastName().length()>2) {
			return true;
		}else {
			System.out.println("Adýnýz ve soyadýnýz minimum 2 karakter olmalý");
			return false;
		}
	}

}
