package com.udemy.java;

public class SswitchEx1 {
	public static void main(String[] args) {
		byte var = 65;
		final byte a = 10;
		final byte b;
		b = 20;
		switch (var) { 
			case 65: 
				System.out.println(1);
				break;
			case a * 5: 
				System.out.println(2);
				break;
			/*case a * 50: 
				System.out.println(3);
				break;*/
			/*case b: //Not compile-time constant
				System.out.println(4);
				break;*/
		/*	case '\u0041':
				System.out.println(5);
				break;
		*/
				/*case '\u20B9':
				System.out.println(6);
				break;*/
			default:
				System.out.println(7);
				break;
		}
	}
}

