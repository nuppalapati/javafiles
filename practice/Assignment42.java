package com.udemy2.java;
/*Print following output using nested while loops:
1
22
333
4444
55555
666666
7777777*/
public class Assignment42 {
public static void main(String[] args) {
	int i=0;
	while(i++<7)
	{
		int j=1;
		while(j++<=i) {
			System.out.print(i);
		}
		System.out.println();
	}
	

	
}
}
