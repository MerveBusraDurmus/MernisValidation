package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� olu�turuldu");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� g�ncellendi");
	}
}
