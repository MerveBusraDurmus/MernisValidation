package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.Utils.Utils;
import eCommerce.entities.concretes.User;
import eCommerce.entities.dtos.LoginDto;

public class AuthManager implements AuthService{
	
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userValidate(user) 
				&& passwordValidate(user.getPassword()) 
				&& userExists(user.geteMail())== false 
				&& Utils.emailValidate(user.geteMail())) {
			
			userService.add(user);
			
		}else {
			System.out.println("Kayıt başarısız");
		}
		
	}

	@Override
	public void verify(User user, String token) {
		if(user!=null  && token.length()>20) {
			User existUser = userService.get(user.geteMail());
			existUser.setVerify(true);
			
			userService.update(existUser);
			
			System.out.println("Email doğrulandı");
		}else {
			System.out.println("Email doğrulanamadı");
		}
		
	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);
		if(user==null) {
			return false;
		}else {
			System.out.println("Email zaten mevcut!"+ email);
			return true;
		}
		
	}

	@Override
	public void login(LoginDto dto) {
		
		User user = userService.get(dto.getEmail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Başarıyla giriiş yapıldı");
		}else {
			System.out.println("Kullanıcı adı veya şifre hatalı");
		}
	
		
	}
	
	
	public boolean userValidate(User user) {
		if(user!=null && !user.getFirtName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}else {
			System.out.println("Tüm alanları girmek zorunludur");
			return false;
		}
	
	}
	
	
	
	public boolean passwordValidate(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			System.out.println("Şifre karakterden kısa olamaz");
			return false;
		}
	}
	
	

}
	
	
	


