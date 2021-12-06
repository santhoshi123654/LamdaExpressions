package com.bridgelabz;

public class Main {
	
	public static void main(String[] args) {
		IMathOperation add = (a,b) -> a+b;
		System.out.println(add.calculate(10, 10));
		
		IMathOperation sub = (a,b) -> a-b;
		System.out.println(sub.calculate(20, 10));
		
		IMathOperation div = (a,b) -> a/b;
		System.out.println(div.calculate(20, 10));
	}
}
