package com.udemy.java;

public class Assignment1 {
	/* if marks < 60, then print "Fail"
	    if marks >= 60 but less than 90 , then print "Pass"
	    if marks >= 90, then print "Passed with Distinction"
	*/public static void main(String[] args) {
		int marks = 45;
		if(marks >=90) {
			System.out.println("Passed with distinction");
		}else if(marks>=60) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
	}

}
