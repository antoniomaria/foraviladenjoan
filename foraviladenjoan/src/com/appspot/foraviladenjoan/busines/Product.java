package com.appspot.foraviladenjoan.busines;

import com.appspot.foraviladenjoan.util.Constant;

public class Product {
	
	private String name;
	
	private double cost;
	
	private String unit;
	
	private boolean available;
	
	private String imagePath;
	
	public Product(String name){
		this.name = name;
		this.available = false;
		this.imagePath = Constant.IMAGES_BASE_PATH + "image-not-available.jpg";
		this.unit = "€/Kg";
	}
	
	public Product (String name, double cost, String unit,
			boolean available, String imagePath) {
		super();
		this.name = name;
		this.cost = cost;
		this.unit = unit;
		this.available = available;
		this.imagePath = imagePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = Constant.IMAGES_BASE_PATH + imagePath;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}


}
