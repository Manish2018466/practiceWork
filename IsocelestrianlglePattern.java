package lecturehel2;
import java.util.*;
public class IsocelestrianlglePattern {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	while(i<=n)
	{
		int k=1;
		while(k<=n-i)
		{
			System.out.print(" ");
			k++;
		}
		int p=1;
		int j=1;
		while(j<2*i)
			{
			if(j<i)
			{
				System.out.print(j);
				j++;
				p++;
			}
			else
			{
				System.out.print(p);
				p--;
				j++;
			}
			
		}
		System.out.println();
		i++;
	}
	
	
}
}
