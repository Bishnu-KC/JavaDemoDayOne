package com.company.dayone;
import javax.swing.*;

public class OperatorsDemo {
	public static void main (String args[])
	{
		// There are 6 different types of operators.
		/*
		 * 1. Basic Arithmetic
		 * 2. Assignment
		 * 3. Auto-increment
		 * 4. Logical
		 * 5. Comparison
		 * 6. Ternary
		 */
		
		// 1. Basic Arithmetic
		//+,-,*, and / and %
		int a=10;
		int b=2;
		System.out.println("The sum of a and b is:"+(a+b));
		System.out.println("The difference of a and b is:"+(a-b));
		System.out.println("The product of a and b is:"+(a*b));
		System.out.println("The division of a and b is:"+(a/b));
		System.out.println("The modulo of a and b is:"+(a%b));
		
		// 2. Assignment Operators
		//=,+=,-=,*=,/=, and %=
		/*
		 int c = 1;
		    int d= 2;
		    int e = 3;
		    c += 5;
		    d *= 4;
		    e += c * d;
		    e %= 6;
		    System.out.println("a = " + c);
		    System.out.println("b = " + d);
		    System.out.println("c = " + e);
		    */
		a=b;
		System.out.println(a);
		b+=a;
		System.out.println(b);
		b-=a;
		System.out.println(b);
		b*=a;
		System.out.println(b);
		b/=a;
		System.out.println(b);
		b%=a;
		System.out.println(b);
		//JOptionPane.showMessageDialog(null,"Operater Examples:");
		
		// 3. Auto- Increment and Auto Decrement
		int x=1;
		System.out.println("Auto Increment: "+x++);
		System.out.println("Auto Increment: "+(++x));
		int y=5;
		System.out.println("Auto Decreement: "+x--);
		System.out.println("Auto Devreement: "+(--x));
		
		// Logical Operators
		
		//&&, ||,!
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!(b1 && b2));
		
		// Comparison Operators
		// ==, !=,>,<>=,<=
		int c=10;
		int d=50;
		if(c==d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		if(c!=d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		if(c>d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		if(c<d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		if(c>=d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		if(c<=d)
		{
			System.out.println("c and d are same.");
		}
		else
		{
			System.out.println("c and d are not the same.");
		}
		
		// Ternary Operators
		// var name =(expression) ? value if true: value if false;
		int num;
		num=10;
		int num1=(num==10) ? 100:200;
		System.out.println(num1);
		//
		
		
		
	}

}
