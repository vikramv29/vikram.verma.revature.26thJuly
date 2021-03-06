package mytasks;
import java.util.Arrays ;
public class RemoveDupli {
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {50,46,46,85,85,34,50,85,46};
        Arrays.sort(arr);
        int l = arr.length;  
        l = removeDuplicateElements(arr, l);  
        for (int i=0; i<l; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  

