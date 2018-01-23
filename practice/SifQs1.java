package com.udemy.java;

public class SifQs1 {
	public static void main(String[] args) {
		int score = 65;
		if(score > 60)
			System.out.println("Congratulations...");
			//System.out.println("You passed...");// if we include this statement the result will be compilation error because else block should be present immediate to the if.
		else
			System.out.println("You failed...");
		// this can be written in the other ways as well
			if(score > 60) {
				
			
				System.out.println("Congratulations...");//if we want to execute both statements
				System.out.println("You passed...");
			}
			else
				System.out.println("You failed...");

		


	}
}
