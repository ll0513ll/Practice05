package com.javaex.problem01;

public class Mul {
    
   private int a;
   private int b;
   int calculate;

	public void setValue(int a, int b) {
		  
		  this.a = a;
		  this.b = b;
	  }
	  
	 public void calculate() {
		 System.out.println(">> "+ (this.a * this.b) );

	 }

}
