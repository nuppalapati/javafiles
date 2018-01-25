package com.Arrays.java;

public class ExampleArray_5 {
	public static void main(String[] args) {
		int [] i = new int[5];
		i[0] =5;
		i[1] =2;
		i[2] =1;
		i[3] =3;
		i[4] =4;
	int sum =0,avg;
	for(int j=0;j<i.length;j++)
		sum=sum+i[j];
	avg=sum/i.length;
	System.out.println("sum of numbers is "+sum+"  avg of numbers is "+avg);
}
}
