package com.udemy.java;
//Write a program to calculate the sum of the numbers from 1 till upper bound.
public class Assignment22 {
	public static void main(String[] args) {
		final int upperbound =100;
		int ctrl = 1;
		int sum =0;
		while(ctrl<=upperbound) {
			sum +=ctrl;
			ctrl++;
		}
		System.out.println(sum);
	}

}
