package strings;
import java.util.*;
public class CheckPalindromeString {
	public static boolean check(String str)
	{
	String rev=reverse(str);
	return str.equals(rev);
	}
	public static String reverse(String str)
	{
		String rev="";
		/*for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}*/
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
   System.out.println(check(str));
}
}
