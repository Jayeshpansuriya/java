package hashing1;
import java.util.*;
public class Hashset {
    public static void main (String[ ]args){
        HashSet<String> hSet = new HashSet<>();//haseset is only support the string value

        hSet.add("jayesh");//like this we can add a list 
        hSet.add("jay");
        hSet.add("jd");
        hSet.add("jems");
        hSet.add("Bond");
        hSet.add("Bond");//duplicate value of the hset it will not print more tahn on time 
        hSet.add(null); //null value is aloved 
        System.out.println(hSet);//it will print hset list

            hSet.remove("jd");//it wil removw the jd from the list 

            System.out.println("list hset after removing " + hSet);
            System.out.println("who is the Gangster? " + hSet.contains("jayesh"));//if the folowing content will present then it will return true otherwise false


            System.out.println("Iterating over Haseset:");
            Iterator<String> vals= hSet.iterator();
            while(vals.hasNext())//this loop will make a pointer top to botume
            System.out.println(vals.next());//this will print that pointer 



        }

        
    }
