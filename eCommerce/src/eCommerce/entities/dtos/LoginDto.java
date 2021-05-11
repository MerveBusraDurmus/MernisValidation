package eCommerce.entities.dtos;

public class LoginDto implements Dto{

	//fields
	private String email;
	private String password;
	
	
	//constructor
	public LoginDto() {
		super();
	}


	public LoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	//encapsulation
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
