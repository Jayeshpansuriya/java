package hashing1;
import java.util.*;

public class HashMap {
    public static void main(String[]args){
           HashMap<String,String> hmap1 = new HashMap<String,String >();  //here the one error 

        hmap1.put("jone",2345889);//here list will added in to the hasemap
        hmap1.put("jay",2345723);
        hmap1.put("bond",007);
        hmap1.put("weak",2345984);
        hmap1.put("defender",23435);
         // in the hase map we can store the null key and null value 
        hmap1.put(null,null);
        //but we can not store more than one null "key ". but we can more than one null "value"
        hmap1.put("Gopal",null);

        System.out.println(hmap1);//it will print the hase map list 
        System.out.println("the size of HasMap:" , hmap1.size());//it will print the number of the element in the list 
 
        //like the above code we can define more than one hasemaps

        if(hmap1.containskey("weak")){
            Integer val=hmap1.get("weak");//it will store the value of the key 
            System.out.println(+ val);//it will print the  value of the key 
        }

        
      }

    
}
