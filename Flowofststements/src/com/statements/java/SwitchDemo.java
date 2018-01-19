package com.statements.java;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a monthnumber");
		int monthnumber = sc.nextInt();
		String month ;
		switch(monthnumber)
		{
		case 1: month = "Quarter1"; break; 
		case 2:  month = "Quarter1";break;
		case 3: month = "Quarter1";
		break;

		case 4: month = "Quarter2";
		break;
		case 5: month = "Quarter2";
		break;
		case 6: month = "Quarter2";
		break;
		case 7: month = "Quarter3";
		break;
		case 8: month = "Quarter3";
		break;
		case 9: month = "Quarter3";
		break;
		case 10: month = "Quarter4";
		break;
		case 11: month = "Quarter4";
		break;
		case 12: month = "Quarter4";
		break;
		default : month = "unknown";
		System.out.println("ur no is in  " + month);
			
				
		}
		
		System.out.println("ur no is in  " + month);
		
		
		
		/*if(monthnumber>=1 && monthnumber<=3)
		{
			month = "quarter1";
		}
		else if(monthnumber>=4 && monthnumber<=6) {
			month = "quarter 2";
		}
		else if(monthnumber>=7 && monthnumber<=9) {
			month = "quarter 3";
		}
		else if(monthnumber>=10 && monthnumber<=12) {
			month = "quarter 4";
		}
		else {
			month = "unknown";
		}
		System.out.println("your number is "  + month);*/
	

}
}
