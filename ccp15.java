/*
 * Practice problem - Tax in Chefland
 * In Chefland, a tax of rupees
 * 10
 * 10 is deducted if the total income is strictly greater than rupees
 * 100
 * 100.
 * Given that total income is
 * �
 * X rupees, find out how much money does the Chef take home.
 */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		// Update your code below this line solve the problem
    		if(x>100){
    		   x=x-10;
    		   System.out.println(x);
    		}else{
    		    System.out.println(x);
    		}
		}
	}
}