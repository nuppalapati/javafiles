package com.handling.java;

import java.io.IOException;

public class testthrows {

		  void m() throws IOException{
		    throw new IOException("device error");//checked exception
		  }
		  void n() throws IOException{
		    m();
		  }
		  void p(){
		   try{
		    n();
		   }catch(Exception e){System.out.println("exception handled");}
		  }
		  public static void main(String args[]){
		   testthrows obj=new testthrows();
		   obj.p();
		   System.out.println("normal flow...");
		  }
	}


