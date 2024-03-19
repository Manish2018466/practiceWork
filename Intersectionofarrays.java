package revisedArrray;
import java.util.*;
public class Intersectionofarrays {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	int arr1[]=new int[m];
	int arr2[]=new int[n];
	for(int i=0;i<m;i++)
	{
		arr1[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		arr2[i]=s.nextInt();
	}
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		if(arr1[i]==arr2[j])
		{
			System.out.print(arr1[i]+" ");
			arr2[j]=-1111111;
			break;
		}
	}
}
}
}