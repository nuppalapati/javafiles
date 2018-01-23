package com.udemy.java;

public class SifQs2 {
	public static void main(String[] args) {
	/*	int flag = 1;//in this case the statement is giving compilation error beacuse 
		//we cant validate regular expressions just like (flag =1)
		if(flag = 1)
			System.out.println("Start");
		else
			System.out.println("Stop");
	}
*/
// We can use boolean expression for the result with single '='.
		/*	boolean flag = true;
			if(flag = false)// in this case the value of value which we declared outside is not 
				//going to assign to the flag in if block we ca assign by using '=='
				System.out.println("Start");
			else
				System.out.println("Stop");
		}
	}*/
		boolean flag = false;
		if(flag ==true)
			System.out.println("Start");
		else
			System.out.println("Stop");
	}
}


