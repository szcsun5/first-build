package com.test.beans;

public class Car {
private int price;
private String brand;
private String crop;
private int maxSpeedl;
public Car() {
	super();
}

public Car(int price, int maxSpeedl,String brand) {
	super();
	this.price = price;
	this.brand = brand;
	this.maxSpeedl = maxSpeedl;
}

public void say(){
	System.out.println("ËÙ¶È"+this.maxSpeedl);
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getCrop() {
	return crop;
}

public void setCrop(String crop) {
	this.crop = crop;
}

public int getMaxSpeedl() {
	return maxSpeedl;
}

public void setMaxSpeedl(int maxSpeedl) {
	this.maxSpeedl = maxSpeedl;
}

@Override
public String toString() {
	return "Car [price=" + price + ", brand=" + brand + ", crop=" + crop
			+ ", maxSpeedl=" + maxSpeedl + "]";
}

}
