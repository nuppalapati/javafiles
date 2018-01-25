package com.udemy2.java;

public class Nestedif2 {

	public static void main(String[] args) {
int value =3;
if(value>2)//1
	if(value>5)//2
		if(value<7)//3
			System.out.println('a');//the else block corresponding to the if are together
		else//3//here the pairs are been declared acc to their blocks
			System.out.println("b");
	else//2 
		System.out.println("c");
	}

}
