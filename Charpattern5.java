package lecturehel2;
import java.util.*;
public class Charpattern5 {
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
		int j=1;
		while(j<=i)
		{
			System.out.print(j);
			j++;
		}
		System.out.println();
		i++;
		
	}
}
}
