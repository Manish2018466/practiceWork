package revisedArrray;
import java.util.*;
public class Sort01 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	int c0=0;
	int c1=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==0)
		{
			c0++;
		}
		else
		{
			c1++;
		}
	}
	
	for(int i=0;i<c0;i++)
	{
		arr[i]=0;
	}
	for(int i=c0;i<n;i++)
	{
		arr[i]=1;
	}
 for(int i=0;i<n;i++)
 {
	 System.out.print(arr[i]+" ");
 }
}
}
