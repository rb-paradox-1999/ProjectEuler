/* To find sum of all nos. divisible by 3 or 5 below the given int */

import java.util.*;
public class PE_1
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();   //number to be input
    int sum=0;    //output parameter to display sum
    for(int i=1;i<n;i++)
    {
        if(i%3==0 || i%5==0)
        sum+=i;
    }
    System.out.println("Sum= "+sum);
  }
}

// end of program
