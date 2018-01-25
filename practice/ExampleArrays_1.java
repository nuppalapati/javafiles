package com.Arrays.java;

public class ExampleArrays_1 {
public static void main(String[] args) {
	int [] scores = new int[5];
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores[3]);
	scores[0] ='A';
	scores[1] ='b';
	scores[2] =11;
	scores[3] =33;
	scores[4] =44;
	System.out.println(scores[0]);
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores[3]);
	int avg =(scores[2]+scores[3]+scores[1]+scores[0])/4;
	System.out.println(avg);
	
	
	
}}
	
	
	/*int score1 =40;
	int score2 =50;                    //traditional way of declaring no logic inside
	int score3 =60;
	int score4 = 70;
	int score5 = 80;
	int avgscore = (score1+score2+score3+score4+score5)/5;
	System.out.println(avgscore);
*/	

