package com.handling.java;

public class Testthow {
	static void fun()
	{
		try
		{
			throw new ArithmeticException("demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in main.");
		}


	}
}
