package com.simple.sampleCode;
import java.util.*;

public class IfElse {
	public static void main(String args[])
	
	{
		Scanner obj=new Scanner(System.in);
		int a, b;
		System.out.println("Enter a:");
		a=obj.nextInt();
		System.out.println("Enter b:");
		b=obj.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b.");
		}
		else
			System.out.println("b is greater tha a.");
		
	}

}
