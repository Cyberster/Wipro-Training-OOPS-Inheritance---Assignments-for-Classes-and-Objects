package com.w3epic.wiprotraining;

class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(12, 2));
		System.out.println(Calculator.powerDouble(1.5, 2));
	}

}
