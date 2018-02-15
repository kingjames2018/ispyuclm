import java.util.*;

class Challenge2
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		String str;
		
		System.out.print("Enter string: ");
		str = console.nextLine();
		
		System.out.print("Is "+str+" a palindrome? "+method1(str));
	}
	public static boolean method1(String passedStr)
	{
		boolean trap = false;
		int j = passedStr.length()-1;
		
		for(int i=0; i<passedStr.length(); i++)
		{
			if(passedStr.charAt(i)==passedStr.charAt(j))
			{
				trap = true;
			}
			else
			{
				trap = false;
			}
			j--;
		}
		return trap;
	}
}