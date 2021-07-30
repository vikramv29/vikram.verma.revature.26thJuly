package mytasks;
import java.util.Arrays ;
public class GetPalin {
	static boolean Palin(int n)
	{
		int rem=0; int rev=0; int temp=n ;
			while(n>0)
			{
				rem= n%10 ;
				rev= rev*10+rem ;
				n=n/10 ;
			}
			
	 if(rev==temp) return true ;
	else return false ;
	}
	static void printPalin(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(Palin(arr[i])==true)
			{
				System.out.println(arr[i]+" ") ;
			}
		}
	}
     public static void main(String[]args)
     {
    	 int arr[] = {50,46,383,85,85,545,50,85,464};
         Arrays.sort(arr);
         printPalin(arr) ;
     }

}
