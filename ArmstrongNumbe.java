package mediumq;
import java.util.*;
public class ArmstrongNumbe {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	     int rem=0;
	     int sum=0;
	     
	     int c=n;
	     int count=0;
	     while(n>0)
	     {
	    	count++;
	    	n=n/10;
	     }
	     
	      int d=c;
	     while(c>0)
	     {
	    	 rem=c%10;
	    	 int p=count;
	    	 int pow=1;
	    	 while(p>0)
	    	 {
	    		 pow=pow*rem;
	    		 p--;
	    	 }
	    	sum=sum+pow;
	    	c=c/10;
	     }
	     System.out.println(sum);
	     if(sum==d)
	     {
	    	 System.out.print("True");
	     }
	     else
	     {
	    	 System.out.print("false");
	     }
	     
	     	}

}
