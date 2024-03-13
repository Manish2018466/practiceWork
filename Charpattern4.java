package lecturehel2;
import java.util.*;
public class Charpattern4 {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char c=(char)('A'+n-1);
int i=0;
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
	c=(char)(c-1);
}

}
}
