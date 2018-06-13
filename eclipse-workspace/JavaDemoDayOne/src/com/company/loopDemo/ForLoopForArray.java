package com.company.loopDemo;

public class ForLoopForArray {
	public static void main (String args[])
	{
		int n[]= {10,20,30,40};
		int sum=0;
		String str[]= {"Apple","Banna","Cheery"};
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		// foreach loop or enhanced for loop
		for(int num:n)
		{
			System.out.print(num);
			sum+=num;
		}
		System.out.println("\n"+"The sum is:"+ sum);
		for(String s: str)
		{
			System.out.println(str[2]);
		}
		// 
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

		
	}

}
