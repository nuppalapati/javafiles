package com.handling.java;

import java.io.File;
import java.io.IOException;
public class Testfile
{
public static void main(String[] args) {
	try {
		createAnewfile();
		System.out.println("executed");
	}
	catch(IOException e) {System.out.println("out put generated");
	e.printStackTrace();
}
}
	private static void createAnewfile() throws IOException {
		File file = new File("E:/swami");
		file.createNewFile();

}}
