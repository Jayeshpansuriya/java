/**
 * Chef wants to become fit for which he decided to walk to the office and
 * return home by walking.
 * It is known that Chef's office is
 * �
 * X km away from his home.
 * If his office is open on
 * 5
 * 5 days in a week, find the number of kilometres Chef travels through office
 * trips in a week.
 **/
import java.util.Scanner;
class ccp10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            System.out.println(x*2*5);
        }
    }
}