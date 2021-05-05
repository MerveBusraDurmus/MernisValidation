package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý oluþturuldu");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý güncellendi");
	}
}
