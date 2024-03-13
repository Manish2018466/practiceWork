package lecturehel2;
import java.util.*;
public class charpatters {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char c='A';
int i=0;
while(i<n)
{
	int j=0;
	while(j<n)
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

