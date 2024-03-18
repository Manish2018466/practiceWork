package revisedArrray;
import java.util.*;
public class ArrangeNumers {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int a=1;
	int b=2;
	int i=0;
	int j=n-1;
	while(i<=j)
	{
		arr[i]=a;
		a=a+2;
		i++;
		arr[j]=b;
		b=b+2;
		j--;
	}
	for(int k=0;k<n;k++)
	{
		System.out.print(arr[k]+" ");
	}
}
}
