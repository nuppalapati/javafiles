package com.udemy.java;

public class SswitchEx2 {
	public static void main(String[] args) {
		String colorCode = "R";
		switch (colorCode) { //Use of String in switch expression was allowed from Java 7 onwards
			case "R"://if you don't use break it will execute code up-to break
			case "r":
				System.out.println("Traffic light is RED.");
				break;
			case "O":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
			case "G":
				System.out.println("Traffic light is GREEN.");
				break;
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
		}
	}
}
