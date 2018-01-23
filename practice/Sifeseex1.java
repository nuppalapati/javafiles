package com.udemy.java;

public class Sifeseex1 {
	public static void main(String[] args) {
		byte hour = 16;
		
		if(hour < 12) {
			System.out.println("Good Morning");
		}// in this case we dont need to use the reg exss because else if means all the ststemnts except if
		else if(hour < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}
}


