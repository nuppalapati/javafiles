package com.trails.java;

import java.util.Scanner;

public class Emailvaldation {
	public static class App {

	    Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        App app = new App();

	        app.GetUsername(true);
	    }

	    public void GetUsername(Boolean firstRun) {

	        if(!firstRun) {
	            System.out.println("The username you have entered was in an incorrect format. Must match abc@xyz.net");
	        } else {
	            System.out.println("Please enter a username:");
	        }

	        String userInput = this.scanner.nextLine();

	        UsernameCheck usernameCheck = new UsernameCheck(userInput);

	        if(usernameCheck.isValid()) {
	            System.out.println("Welcome, " + userInput + "!");
	        } else {
	            GetUsername(false);
	        }
	    }}}
