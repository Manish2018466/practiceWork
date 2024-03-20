package SearchAndSORT;
import java.util.*;
public class Merge2sorted {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int l=s.nextInt();
	int arr1[]=new int[l];
	for(int i=0;i<l;i++)
	{
	 arr1[i]=s.nextInt();
	}
			int m=s.nextInt();
			int arr2[]=new int[m];
			for(int i=0;i<m;i++)
			{
			 arr2[i]=s.nextInt();
			}
			int n=l+m;
			int arr3[]=new int[n];
int i=0,j=0,k=0;
while(i<l&&j<m)
{
	if(arr1[i]<arr2[j])
	{
		arr3[k]=arr1[i];
		k++;
		i++;
	}
	else 
	{
		arr3[k]=arr2[j];
		k++;
		j++;
	}
}
while(i<l)
{
	arr3[k]=arr1[i];
	k++;
	i++;
}
while(j<m)
{
	arr3[k]=arr2[j];
	k++;
	j++;
}
for(int o=0;o<n;o++)
{
	System.out.print(arr3[o]+" ");
}


}
}