package com.udemy2.java;

public class Continueex2 {
	public static void main(String[] args) {
		int searchnum = 17;
		int count = 0;
		outer: for (int row = 1; row <= 20; row++) {
			inner: for (int col = 1; col <= 10; col++) {
				int num = row * col;
				if (num == searchnum) {
					count++;
					if (col == 1) {
						break outer;// if number is found, and it is first column of the row, then come out of the
									// outer loop
					}
					continue outer; // if number is found, continue with the next iteration of outer loop
				}System.out.println(row*col);
			} // inner for ends
		} // outer for ends

		System.out.println(searchnum + " appears " + count + " times.");
	}
}
