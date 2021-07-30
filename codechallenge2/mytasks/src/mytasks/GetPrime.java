package mytasks;

import java.util.Arrays;

public class GetPrime {
	static boolean IsPrime(int n)
	{ 
		boolean p=true ;
		if(n==0||n==1)
		{
			p=false ;
			return p ;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					p=false;
					break ;
				}
			}
		}
		return p ;
	}
	static void printPrime(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(IsPrime(arr[i])==true)
			{
				System.out.println(arr[i]+" ") ;
			}
		}
	}
	  public static void main(String[]args)
	     {
	    	 int arr[] = {2,34,17,86,11,21,36};
	         Arrays.sort(arr);
	         printPrime(arr) ;
	     }

}
