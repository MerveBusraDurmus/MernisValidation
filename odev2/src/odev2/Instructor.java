package odev2;

public class Instructor extends User {
	
	//Field
	
	private String givenCourses;

	

	//Constructor
	public Instructor() {};
	public Instructor(String givenCourses) {
		this();
		this.givenCourses = givenCourses;
	}
	
	
	//Encapsulation
	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
}
