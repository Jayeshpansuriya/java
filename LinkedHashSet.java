package hashing1;
import java.util.*;
public class LinkedHashSet {
    public static void main(String[ ] args){
        LinkedHashSet <String> lhset = new LinkedHashSet<String>();
        lhset.add("IT company");//we can add content using "add" method 
        lhset.add("Marketing comapny");
        lhset.add("NGO");
        lhset.add("EV-company");
        lhset.add("Automobile comapny");
        lhset.add("Automobile comapny");//if there is any duplicate value the it will print only once as acordig the set rule
        lhset.add(null);//it will suport the null value but it will not print the duplicate null values 

        System.out.println(lhset);//print the list 
        System.out.println("Size of linkedhaseset:"+ lhset.size());//it will show the size of list 
        System.out.println("check if NGO is present?"+ lhset.containskey("NGO"));//if the NGO will present in the list then it will return true othewise false 
        System.out.println("remove EV-company from list "+ lhset.remove("EV-company"));//it will remove the following content from the list 
        System.out.println("the latest list of linkedhaseset is : "+ lhset);//it will print latest list
        
    }
}
