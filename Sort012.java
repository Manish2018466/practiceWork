package SearchAndSORT;
import java.util.*;
public class Sort012 {
	public static int[] sort(int arr[])
	{
		int n=arr.length;
		int c0=0;
		int c1=0;
		int c2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				c0++;
			}
			else if(arr[i]==1)
			{
				c1++;
			}
			else if(arr[i]==2) {
				c2++;
			}
		}
		
		for(int i=0;i<c0;i++)
		{
			arr[i]=0;
		}
		for(int i=c0;i<(c1+c0);i++)
		{
			arr[i]=1;
		}
		for(int i=c1+c0;i<(c0+c1+c2);i++)
		{
		arr[i]=2;	
		}
		return arr;
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	int arr2[]=sort(arr);
	for(int i=0;i<n;i++)
	{
		System.out.print(arr2[i]+" ");
	}
}
}
