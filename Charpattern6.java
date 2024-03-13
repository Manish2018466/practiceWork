package lecturehel2;
import java.util.*;
public class Charpattern6 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	int k=n;
	while(i<=n)
	{
		int j=1;
		while(j<=k)
		{
			System.out.print(k);
			j++;
		}
		System.out.println();
		i++;
		k--;
	}
		
}
}
