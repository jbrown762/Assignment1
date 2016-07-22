package com.week1.day5.assignment1;

public class TestMethodsAndFlow
{

	public static void main(String[] stringArray)
	{
		//String[] stringArray = {"a", "b", "c", "d", "e", "f", "g"};
		
		MethodsAndFlow var = new MethodsAndFlow(stringArray);
		
		var.outputAll();
		
		var.outputSubset(1, 1);
		var.outputSubset(4, 2);
		var.outputSubset(1, 6);
		var.outputSubset(7, 9);
	}

}
