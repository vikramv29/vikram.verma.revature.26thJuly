package mytasks;
import java.util.Arrays;

public class NthLarge {
	
	public static int nthLargest(int arr[],int k)
{

    Arrays.sort(arr) ;
    return arr[arr.length-k];
}

public static void main(String[] args)
{
	int arr[] = new int[] { 100,100,2,25,3,4,9,5,6,5 };
int k = 2;
System.out.println(nthLargest(arr,k));
}
}


