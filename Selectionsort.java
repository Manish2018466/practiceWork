package SearchAndSORT;
import java.util.*;
public class Selectionsort {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int temp=0;
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int min=arr[i];
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]<min)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
