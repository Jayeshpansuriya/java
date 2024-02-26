/**Task
Write a program which does the following

Accepts the count of test cases - 
�
t
Each test case has one integer 
�
N
Output the following for each test case
If input is less than or equal to 
100
100, output 'Good'
If input is greater than 100 but less than or equal to 
200
200, output 'Better'
If the input is greater than 200, output 'Best' */
// Update the blanks in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            // Accept one integer as input
    		int n = read.nextInt();
    		
    		// 1st condition in the problem
    		if(n<=100){
    		    System.out.println("Good");
    		}
    		
    		// 2nd condition in the problem
    		else if(n>=100 && n<=200){
    		    System.out.println("Better");
    		}
    		
    		// 3rd condition in the problem
    		else{
    		    System.out.println("Best");
    		}
		}
	}
}
