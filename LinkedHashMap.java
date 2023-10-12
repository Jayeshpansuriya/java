package hashing1;
import java.util.*;
public class LinkedHashMap{

    public static void main(String[]args){
        LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>();/*(HashMap or LinkedHashMap) depending on whether you need to maintain insertion order or not. */
          
            lhmap.put("gujarat","gujarati");//we can make list by put method 
            lhmap.put("maharastra","marathi");
            lhmap.put("bangladesh","bangali");
            lhmap.put("rajasthan","rajasthani");
            lhmap.put("dilhi","hindi");
            lhmap.put("panjab","panjabi");
            lhmap.put(null,"bevafa");//it will contains the null value
            lhmap.put("ratanpur",null);
            System.out.println(lhmap);//it will [rint the list of linkedhashMap ]
            System.out.println("Size of lhmap:"+ lhmap.size());//it will retern the size of the list 
            System.out.println("the value fpr gujarat:"+ lhmap.get());//it will print the value of the perticuler key 
            System.out.println("Dose it have key value 'dilhi' ?" + lhmap.containskey("dilhi"));//if the list will have the foloving contais then it will return true other wise false
            System.out.println("remove the panjab:" + lhmap.remove("panjab"));//it will remove the key and value bothe
            System.out.println("Mapped Linkedhashmap :/n" + lhmap);//it will print the refresh list 

            
    }
}