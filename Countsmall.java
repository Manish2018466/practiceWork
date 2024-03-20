package SearchAndSORT;
import java.util.*;
public class Countsmall {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int arr[]=new int[m];
	for(int i=0;i<m;i++)
	{
		arr[i]=s.nextInt();
	}
	int n=s.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr1[i]=s.nextInt();
	}
	for(int i=0;i<m;i++)
	{
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]>=arr1[j])
			{
				count++;
			}
		}
		System.out.print(count+" ");
	}
    
}
}
