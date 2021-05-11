package eCommerce.core.Utils;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;
import eCommerce.entities.dtos.LoginDto;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	
	private UserService userService;

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		
		if(userExists(email) == false) {
			userService.add(email);
		}else {
			
			User user= userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.geteMail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}

	@Override
	public boolean userExists(String email) {
		
		if(userService.get(email)!=null) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void login(LoginDto dto) {
		if(dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Ba�ar�yla giri� yapt�n�z");
		}else {
			System.out.println("Kullan�c� veya parola hatal�");
		}
		
	}

}
