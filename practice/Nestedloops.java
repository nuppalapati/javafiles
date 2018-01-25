package com.udemy2.java;

public class Nestedloops {
	public static void main(String[] args) {
		int age = 11;
		int height = 44;
		if (age > 10)
			if (height >= 45)
				System.out.println("welcome and enjoy your day");
			else// here the else block is corresponding to the inner if loop
				System.out.println("sorry you are not elgible for ride");
	}
}
