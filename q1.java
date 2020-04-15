/* To find sum of all nos. divisible by 3 or 5 below the given int */

import java.util.*;
public class PE_1
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();   //number to be input
    int temp=n/3;
    int sumof3=3*(n*(n+1)/2);
    temp=n/5;
    int sumof5=5*(n*(n+1)/2);
    temp=n/15;
    int sumof15=15*(n*(n+1)/2);
    System.out.println("Sum= "+(sumof3+sumof5-sumof15));
    sc.close();
  }
}

// end of program
