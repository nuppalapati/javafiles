package com.udemy.java;

public class Assignment24 {
public static void main(String[] args) {
	

	int start = 1;
	int end = 7 ;
	while(start <= end) {
		while (start <= end) {
			if(start % 2 != 0){
				System.out.print(start);
				
				//Logic to add comma
				if(end % 2 == 0){ //If end is an even number
					if(start != (end - 1)) { //check to not add , after printing last number
						System.out.print(", ");
					}
				} else { //If end is an odd number
					if(start != end) { //check to not add , after printing last number
						System.out.print(", ");
					}
				}
			}
			start++;
		}
	}
}}


