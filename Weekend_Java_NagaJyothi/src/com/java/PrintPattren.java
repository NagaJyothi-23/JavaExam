package com.java;

public class PrintPattren 
{
	public void print(int n)
	{
		for(int index=1;index<=n;index++)
		{
			for(int index1=1;index1<=n;index1++)
			{
				if(index==1||index1==1||index1==n||index==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) 
	{
		PrintPattren result=new PrintPattren();
		result.print(5);
		
		
	}

}
