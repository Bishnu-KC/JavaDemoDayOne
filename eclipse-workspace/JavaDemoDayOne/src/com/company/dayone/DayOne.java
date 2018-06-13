package com.company.dayone;
import java.util.Scanner;

public class DayOne 
{
	static String str = "Test";
	static int num1=12;
	public static void main(String [ ] args)
	{
		/*
		 * Scanner scan =new Scanner (System.in);
		System.out.println("Enter the name");
		String str=scan.nextLine();
		//scan.close();
		System.out.println("THe name that you entered:"+str);
		System.out.println("Your age: "); 
		int age = scan.nextInt(); // it's an integer 
		System.out.println("THe age that you entered:"+age);
		*/
		
		/*
		 * Local Variable
		 * Static Variable
		 * Instance Variable
		 */
		/*
		 * Static variable
		 */
		System.out.println(str);
		System.out.println(num1);
		// main method in short cut
		/*
		 * Java Data type
		 * 1. Primitive data type
		 * a.boolean
		 * b.byte
		 * c.char
		 * d.short
		 * e.int
		 * f.long
		 * g.float
		 * h.double
		 * 2. Reference Data type
		 * a.String
		 * b.Array
		 */
		/*
		 * Examples of Datatypes
		 */
		//int a=5;
		//int b=10;
		//int c=a+b;
		//System.out.println("The sum of a and b is:" +c);
		//Calculating the size of primitive Data type
		/*
		System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
        */
		// Scanner 
		Scanner scan = new Scanner(System.in);  
		System.out.println("Enter Num1: "); 
		int a1 = scan.nextInt(); // it's an integer 
		System.out.println("Enter Num2: "); 
		int b1 = scan.nextInt(); // it's an integer 
		int c1=a1+b1;
		System.out.println("The sum is: " +c1);
		//Assignment make a calculator using scanner class
		//Master JRE, JDk, JVM
	}
	

}
