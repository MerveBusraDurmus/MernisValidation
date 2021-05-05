package odev2;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmenin bilgileri eklendi");
	}
	
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmenin bilgileri silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli eðitmenin bilgileri güncellendi");
	}
}
