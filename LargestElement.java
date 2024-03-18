package revisedArrray;
import java.util.*;
public class LargestElement {
	public static int[] takeinput()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int max(int arr[])
	{
		int n=arr.length;
		int maxi=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>maxi)
			{
				maxi=arr[i];
			}
		}
		return maxi;
	}
	
	public static void main(String args[])
	{
		int arr[]=takeinput();
		System.out.print(max(arr));
	}
}