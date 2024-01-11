package com.java;

import java.util.Iterator;

public class Pattren 
{
	public void print(int n) {
		for(int index1=1;index1<=n;index1++)
		{
			for(int index2=1;index2<=n-index1;index2++)
			{
				System.out.print(" ");
			}
			for(int index3=1;index3<=index1;index3++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int index1=n;index1>=1;index1--)
		{
			for(int index2=1;index2<=n-index1;index2++)
			{
				System.out.print(" ");
			}
			for(int index3=1;index3<=index1;index3++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) 
	{
		Pattren result=new Pattren();
		result.print(5);
				
	}

}
