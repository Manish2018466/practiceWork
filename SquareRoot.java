package mediumq;
import java.util.*;
public class SquareRoot {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pf=1;
		if(n==0)
		{
			System.out.print(0);
		}
		else
		{
			for(int i=1;i<=n/2;i++)
			{
				pf=i*i;
				if(pf==n)
				{
					System.out.print(i);
					break;
				}
				else if(pf>n)
				{
					System.out.print(i-1);
					break;
					
				}
				
			}
		}
	}

}
