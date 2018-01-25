package com.udemy2.java;

public class Break1 {
	public static void main(String[] args) {
		outer:
		for(int i=1;i<=10;i++)
		{
			inner:
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+ " ");
				if(i*j==24) {
					break outer;
					//break;// in this case break with out label an only come out of iner loop if want to use it 
					//effectively you have to use label statements.
				}
			}System.out.println();
		}
	}

}
