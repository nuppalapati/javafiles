package com.employee.java;

import java.util.Scanner;

public class Person {
	public static void main(String[] args)
	{
		Scanner e = new Scanner(System.in);
		System.out.println("enter the phonenumber");
		int phonenumber = e.nextInt();
		System.out.println("enter the name");
		String name = e.next();
		System.out.println("enter the id");
		int id = e.nextInt();
		System.out.println("enter the address");
		String address = e.next();
		
		Employee employee = new Employee(name, id, phonenumber, address);
		System.out.println(employee);
		
		
	}

}
