package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	System.out.print(">> ");
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	String type = sc.next();
    	int b = sc.nextInt();
    	
    	if(type.equals("+")) {
        	Add add = new Add();
    		add.setValue(a, b);
            add.calculate();
    	} else if(type.equals("/")) {
    		Div div = new Div();
    		div.setValue(a, b);
    		div.calculate();
    	} else if(type.equals("*")) {
    		Mul mul = new Mul();
    		mul.setValue(a, b);
    		mul.calculate();
    	} else if(type.equals("-")) {
    		Sub sub = new Sub();
    		sub.setValue(a, b);
    		sub.calculate();
    	} else {
    		System.out.println("알 수 없는 연산입니다.");
    	}

    	main(null);

    }
}
