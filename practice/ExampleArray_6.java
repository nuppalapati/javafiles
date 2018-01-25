package com.Arrays.java;

public class ExampleArray_6 {
	public static void main(String[] args) {
		
	
	int [] k =new int[7];
	int sum=0,avg=0;
	for(int i=0,j=2;i<k.length;i++,j =j+2)
	{
		k[i]=j;
		sum=sum+j;
		avg =sum/k.length;
		System.out.println(j);
		
}System.out.println( "sum is "+sum+ " avg is "+avg);


	}
}
