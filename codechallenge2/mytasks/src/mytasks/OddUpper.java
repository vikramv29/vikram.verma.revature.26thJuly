package mytasks;

public class OddUpper {
public static void main(String[]args)
{
	System.out.println(oddOneUpper("hello good morning hope we are happy")) ;
}
public static String oddOneUpper(String s)
{
	String a[]= s.split(" ");
	StringBuffer sb= new StringBuffer() ;
	for(int w=0; w<a.length;w++)
	{
		int l= a[w].length();
		if(l%2==0)
		{
			sb.append(Character.toUpperCase(a[w].charAt(0))).append(a[w].substring(1)).append(" ");
		}
		else
		{
			int d= l/2 ;
			sb.append(a[w].substring(0,d)).append(Character.toUpperCase(a[w].charAt(d))).append(a[w].substring(d+1)).append(" ");
		}
	}
	return sb.toString().trim();
}
}
