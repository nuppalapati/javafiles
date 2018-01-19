package com.handling.java;

import java.util.Scanner;

public class ExampleClass {
 static int c1;
public static void main(String[] args)
{
	int a,b;
	
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter the first value");
	
	a = sc.nextInt();
	
	System.out.println("Enter second value");
	b = sc.nextInt();
	
	try {
	int c1 = a/b;
	System.out.println("correct  "  +  c1);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("error"  + c1 );
	}
	

}
}
