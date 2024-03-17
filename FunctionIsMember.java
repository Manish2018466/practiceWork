package mediumq;
import java.util.*;

public class FunctionIsMember {
	public static boolean Ismember(int n)
	{
		int a=0;
		int b=1;
		int c;
		while(a<n)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(a==n)
		{
			return true;
		}
		else {
			return false;}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println(Ismember(i));
	}

}
