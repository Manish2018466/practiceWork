package SearchAndSORT;
import java.util.*;
public class BubbleSort {
public static void bubblesort(int arr[])
{
	int n=arr.length;
	// temp=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
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
   bubblesort(arr);
   for(int i=0;i<n;i++)
   {
	   System.out.print(arr[i]+" ");
   }
}
}
