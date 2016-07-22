package com.week1.day5.assignment1;

public class MethodsAndFlow
{

	private String[] stringArray;
	private Integer startPosition;
	private Integer numberOfValuesToOutput;

	public MethodsAndFlow()
	{
		// Does nothing
	}

	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	public void outputSubset(int startPosition, int numberOfValues)
	{
		this.startPosition = startPosition-1;
		numberOfValuesToOutput = this.startPosition + numberOfValues;
		
		if (this.startPosition >= 0 && this.startPosition < stringArray.length)
		{
			if (numberOfValuesToOutput > stringArray.length)
			{
				numberOfValuesToOutput = stringArray.length;
			}
			
			for (int i = this.startPosition; i < numberOfValuesToOutput; i++)
			{
				System.out.print(stringArray[i] + " ");
			}

			System.out.println();
		} else
		{
			System.out.println("Invalid start position.");
		}
	}

	public void outputAll()
	{
		outputSubset(1, stringArray.length);
	}
}