package com.handling.java;

public class Exampleclass2 {
	public static void main(String[] args) {
		
	
	 try{
		    int a[]=new int[5];
		    a[4]=55;
		    System.out.println("correct" + a);
		   }
		   catch(ArithmeticException a){System.out.println("task1 is completed");}
		   catch(ArrayIndexOutOfBoundsException b){System.out.println("task 2 completed");}
		   catch(Exception e){System.out.println("common task completed");}

		   System.out.println("rest of the code...");
		 }
}
