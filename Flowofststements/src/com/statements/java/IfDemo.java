package com.statements.java;

import java.util.Scanner;

public class IfDemo {
public static void main(String[] args)
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first your number");
	int x1 = sc.nextInt();
	System.out.println("enter second your number");
	int x2 = sc.nextInt();
	
	if (x1>x2)
	
		System.out.println("first number is large number" + x1);
		
	
	else
	
		System.out.println("second number is large number" + x2);
              }
	}



