package com.simple.sampleCode;
import javax.swing.*;
public class AddTwoNumber {
	public static void main (String args[])
	{
		int a,b,sum;
		String s1,s2;
		s1=JOptionPane.showInputDialog("Enter value of a:");
		a=Integer.parseInt(s1);
		s2=JOptionPane.showInputDialog("Enter value of b:");
		b=Integer.parseInt(s2);
		sum=a+b;
		JOptionPane.showMessageDialog(null,"The sum of two number is : "+sum);
	}

}
