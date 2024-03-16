package mediumq;
import java.util.*;
public class BinarytoDecimal {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int rem=0;
	int dec=0;
	int pv=1;
	while(n>0)
	{
		rem=n%10;
		dec=dec+pv*rem;
		pv=pv*2;
		n=n/10;
	}
	System.out.println(dec);
}
}
