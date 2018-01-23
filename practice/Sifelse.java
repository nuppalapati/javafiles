package com.udemy.java;

public class Sifelse {
	public static void main(String[] args) {
		byte hour = 15;
		//traditional or basic way we just assigning only the if ststements here and executing the satemnts
		
		// if hour is less than 12 noon, greet with Good Morning.
		if(hour < 12) {
			System.out.println("Good Morning");
		}
	    //  if hour is greater than or equal to 12 noon but less than 15 (3 PM), greet with Good Afternoon
		if(hour >= 12 && hour < 15) {
			System.out.println("Good Afternoon");
		}
		// if hour is greater than or equal to 15 (3 PM), greet with Good Evening
		if(hour >= 15) {
			System.out.println("Good Evening");
		}
	}
}

