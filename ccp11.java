/**
 * In a coding contest, there are prizes for the top rankers. The prize scheme
 * is as follows:
 * 
 * Top
 * 10
 * 10 participants receive rupees
 * �
 * X each.
 * Participants with rank
 * 11
 * 11 to
 * 100
 * 100 (both inclusive) receive rupees
 * �
 * Y each.
 * Find the total prize money over all the participants.
 **/
// The code below is incorrect. Debug this code to solve the problem.
import java.util.Scanner;

class ccp11
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		
    		int prize_top10 = 10 * x;
    		
    		int prize_11to100 = 100 * y;
    		System.out.println((prize_top10 + prize_11to100) - y*10);
		}
	}
}
