package lecturehel2;
import  java.util.*;
public class charpattern3 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=0;
	char c='A';
	while(i<n)
	{
		int j=0;
		while(j<=i)
		{
			System.out.print((char)(c+j));
			j++;
		}
		System.out.println();
		i++;
		c=(char)(c+1);
	}
}
}
