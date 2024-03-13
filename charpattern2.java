package lecturehel2;
import java.util.*;
public class charpattern2 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		char c='A';
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(c);
				j++;
			}
			System.out.println();
  i++;
  c=(char)(c+1);

		}
		
	}

}
