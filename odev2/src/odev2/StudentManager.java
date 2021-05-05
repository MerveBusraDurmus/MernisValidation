package odev2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli öðrencinin adres bilgisi eklendi");
	}
	
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli öðrencinin adres bilgisi silindi");
	}

	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli öðrencinin adres bilgisi güncellendi");
	}
}
