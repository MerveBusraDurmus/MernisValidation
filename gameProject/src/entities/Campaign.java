package entities;

import abstract_.Entity;

public class Campaign implements Entity {

	//fields
	private int id;
	private String name;
	private double discountRate;
	
	
	
	//constructor
	public Campaign(int id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}



	//encapsulation
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	
}
