package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;
import eCommerce.entities.dtos.LoginDto;

public interface AuthService {

	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);

	
	//
}
