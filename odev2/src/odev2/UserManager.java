package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli kullanıcı oluşturuldu");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanıcı silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanıcı güncellendi");
	}
}
