package odev2;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmenin bilgileri eklendi");
	}
	
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmenin bilgileri silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli e�itmenin bilgileri g�ncellendi");
	}
}
