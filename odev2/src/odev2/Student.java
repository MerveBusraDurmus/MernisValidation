package odev2;

public class Student extends User{
	
	//Fields
	private String address;
	private String takenCourses;
	
	
	//Constructor
	public Student() {};
	public Student(String address, String takenCourses) {
		this();
		this.address = address;
		this.takenCourses = takenCourses;
	}




	//Encapsulation
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTakenCourses() {
		return takenCourses;
	}
	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	
	
	
	
}
