/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a[]=new int[n];
		int res=0;
		boolean flag=false;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				res=a[i]+a[j];
				if(res==x)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
