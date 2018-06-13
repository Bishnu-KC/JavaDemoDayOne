package com.company.selfexample;

public class LoopDemo {
	 public static void main(String args[])
	 {
         int i=10;
         while(i>1)
         {
              System.out.println(i);
              i--;
         }
         int arr[]={2,11,45,9};
         //i starts with 0 as array index starts with 0 too
         int a=0;
         while(a<4){
              System.out.println(arr[a]);
              a++;
              // Fibonacci Series
              int count = 7, num1 = 0, num2 = 1;
              System.out.print("Fibonacci Series of "+count+" numbers:");

              for (int i1 = 1; i1 <= count; ++i1)
              {
                  System.out.print(num1+" ");

                  /* On each iteration, we are assigning second number
                   * to the first number and assigning the sum of last two
                   * numbers to the second number
                   */
                  int sumOfPrevTwo = num1 + num2;
                  num1 = num2;
                  num2 = sumOfPrevTwo;
              }
         }
         /*
         int count, num1 = 0, num2 = 1;
         System.out.println("How may numbers you want in the sequence:");
         Scanner scanner = new Scanner(System.in);
         count = scanner.nextInt();
         scanner.close();
         System.out.print("Fibonacci Series of "+count+" numbers:");

         int i=1;
         while(i<=count)
         {
             System.out.print(num1+" ");
             int sumOfPrevTwo = num1 + num2;
             num1 = num2;
             num2 = sumOfPrevTwo;
             i++;
         }
         int count = 7, num1 = 0, num2 = 1;
         System.out.print("Fibonacci Series of "+count+" numbers:");

         int i=1;
         while(i<=count)
         {
             System.out.print(num1+" ");
             int sumOfPrevTwo = num1 + num2;
             num1 = num2;
             num2 = sumOfPrevTwo;
             i++;
         }
         */
    }

}
