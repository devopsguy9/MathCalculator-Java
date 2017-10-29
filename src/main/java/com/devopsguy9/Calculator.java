package com.devopsguy9;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Addition: "+Calculator.doAddition(6, 3));
		System.out.println("Substraction: "+Calculator.doSubstraction(6, 2));
		System.out.println("Multiply: "+Calculator.doMultiplication(4, 5));
		
	}

	public static int doAddition(int x,int y)
	{
		return x+y;
	}
	
	public static int doSubstraction(int x,int y)
	{
		return x-y;
	}
	
	public static int doMultiplication(int x,int y)
	{
		return x*y;
	}
	
}

