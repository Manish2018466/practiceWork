package revisedArrray;
import java.util.*;
public class FindUnique {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int temp=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{
				continue;
			}
			if(arr[i]==arr[j])
			{
				count++;
		    }
	   }
		if(count==0)
		{
			temp=arr[i];
			break;
		}
	}
	System.out.print(temp);
}
}
