import java.util.*;

class Challenge1
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int sum=0;
		
		for(int i=1; i<1000; i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum of these multiples is "+sum);
	}
}