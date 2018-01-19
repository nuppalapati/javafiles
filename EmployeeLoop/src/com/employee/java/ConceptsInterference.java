package com.employee.java;

public class ConceptsInterference {
	public static void main(String[] args)
	{

	}

}
abstract class Worker        
{
	 String name;
	String address;
 int phonenumber;
 int dob;
	
	public Worker(String name, String address, int phonenumber, int dob) {
		this.name= name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.dob = dob;
	
}
	class programmer extends Worker 
	{
		String programing;

		public programmer(String name, String address, int phonenumber, int dob,String programing) {
			super(name,address,phonenumber,dob);
			this.programing = programing;
		}
	public void work(){
		System.out.println("i am a programmer and i do programing");
	}
		
	class Manager extends Worker {
		

		int teamsize;

		public Manager(String name, String address, int phonenumber, int dob, int teamsize) {
			super(name, address, phonenumber, dob);
			this.teamsize = teamsize;
		}
		public void work(){
			System.out.println("i am a programmer and i do programing");
		}
		
	}
		class worke
		{
			public void dowork(){
				System.out.println("i am worker and do some work");
			
				
			}
		}
		class carpenter extends worke implements IRun 
		{
			public void dowork() {
				
			
			System.out.println("i create table artiraft");
			}

			@Override
			public void run() {
				System.out.println("carpenter is running");
				
			}
		}
		}
	
interface IRun
{
	void run();
}
}