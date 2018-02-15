import java.util.*;

class Challenge3
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int pence[] = {1,2,5,10,20,50,100,200};
		int sum=0;
		
		sum += 1*pence[6]+1*pence[5]+2*pence[4]+1*pence[2]+1*pence[1]+3*pence[0];
		
		System.out.println("Sum: "+sum);
	}
}