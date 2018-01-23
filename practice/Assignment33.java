package com.udemy1.java;
/*Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
which are divisible by 5.
*/
public class Assignment33 {
public static void main(String[] args) {
	int start =1;
	int end =100;
	int i=0;
	for(i=0;i<=100;i++) {
		if(i%5==0) {
			
			System.out.println(i);
		}
		//System.out.println("the numbers are between"+start+"to"+end);
		
	}
	
}
}
