package com.employee.java;

public class Employee {
	private String name;
	private int id;
	private int phoneNumber;
	private String address;
	
	public Employee(String name, int id, int phoneNumber, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
	

}
