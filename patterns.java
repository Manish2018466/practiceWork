package lecturehel2;
import java.util.*;
public class patterns {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=0;
while(i<n)
{
	int j=0;
	while(j<n)
	{
		System.out.print((char)('A'+j));
		j++;
	}
	System.out.println();
	i++;
	
}
}
}
