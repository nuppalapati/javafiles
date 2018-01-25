package com.udemy2.java;

public class Breakex {
	public static void main(String[] args) {
	
		int upperBound = 10;
		//in this case we can use break to come out of the loop at any point of time by using break with condition
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i == upperBound) {
				break;
			}
		}
		}

}
