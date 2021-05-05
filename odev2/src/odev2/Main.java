package odev2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Merve","Mutlu","merve@gmail.com","123456");
	
		User user2 = new User(2,"Büşra","Çiçek","busra@gmail.com","1548932");
		
		User user3 = new User(3,"Sevgi","Ulu","sevgi@gmail.com","7891023");
		
		
		
		UserManager userManager = new UserManager();
		userManager.add(user3);
		userManager.delete(user1);
		userManager.update(user2);
		
		
		
		//--------------------------------------------------------------------
		
		Student student1 = new Student("adres","Java");
		student1.setId(4);
		student1.setFirstName("Melih");
		student1.setLastName("Saka");
		student1.setEmail("melih@gmail.com");
		student1.setPassword("1234567");
		
		Student student2 = new Student("adres","C#");
		student2.setId(5);
		student2.setFirstName("Selim");
		student2.setLastName("Deniz");
		student2.setEmail("selim@gmail.com");
		student2.setPassword("159864");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.delete(student1);
		studentManager.add(student2);
		
		
		//-----------------------------------------------------------------------
		Instructor instructor1 = new Instructor("Asp.Net");
		instructor1.setId(1);
		instructor1.setFirstName("Sinan");
		instructor1.setLastName("Deniz");
		instructor1.setEmail("sinan@gmail.com");
		instructor1.setPassword("1254873");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.update(instructor1);
	}

}
