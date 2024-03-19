package SearchAndSORT;
import java.util.*;
public class Binarysearch {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	int x=s.nextInt();
	
	int st=0;
	int e=n-1;
	while(st<=e)
	{
	int mid=(st+e)/2;
	if(arr[mid]==x)
	{
		System.out.print(mid);
		break;
 	}
	else if(x>arr[mid])
	{
st=mid;		
	}
	else if(x<arr[mid])
	{
		e=mid;
	}
	
	}
}
}
