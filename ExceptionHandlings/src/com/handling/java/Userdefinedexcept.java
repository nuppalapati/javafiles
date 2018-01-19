package com.handling.java;

import java.util.Scanner;

public class Userdefinedexcept {
	public static void main(String[] args) {
System.out.println("enter your age");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
//program for eligible voter
if(age<=18 || age>=130)
{
try
{
	throw new InvalidageException("age is not valid for vote system it must be range between 18-130");
}catch(InvalidageException e)

{
	System.out.println(e.getMessage());
	System.out.println("wrong entry please try again");
}
}else {
	System.out.println("your age is valid" +  age);
}
	}
	
	}	
	class InvalidageException extends Exception
	{
		String message;

		public InvalidageException(String message) {
			super(message);
			this.message = message;
		}
		
	}
	