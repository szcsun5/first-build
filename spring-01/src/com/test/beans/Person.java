package com.test.beans;

import java.util.List;
import java.util.Map;

public class Person {
   private String name;
   private int age;
   private Car car;
   private List<Car> cars;
   private Map<String, Car> carMap;
public Map<String, Car> getCarMap() {
	return carMap;
}
public void setCarMap(Map<String, Car> carMap) {
	this.carMap = carMap;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

public List<Car> getCars() {
	return cars;
}
public void setCars(List<Car> cars) {
	this.cars = cars;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", car=" + car + ", cars="
			+ cars + ", carMap=" + carMap + "]";
}

   
}
