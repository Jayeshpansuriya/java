import java.util.Hashtable;
import java.util.Iterator;
public class HashTabel {
    public static void main(String[]args){
        Hashtable <Integer,String> ht = new Hashtable <>();
        ht.put(1, "Har Har Mahadev");
        ht.put(2, "jay shree Ram");
        ht.put(3, "jay Mataji");
        ht.put(4, "jay shree krishn");
        //the hash tabel wil print the latest value of the sem key 
                    ht.put(4, "jay Mataji");
                            ht.put(5, "jay Mataji");
                            //sam value can be support

        //ht.put(6, null);

   //in the hashtable null value is not support 

        System.out.println(ht);

        String val = ht.get(2);//it will fatch a value of key from data collection
        System.out.println(val);

        ht.remove(2);
        System.out.println(ht);

        Iterator<Integer> itr =ht.keySet().iterator();
        while(itr.hasNext()){
            Integer key = itr.next();
            String mapvalue = ht.get(key);
            System.out.println("KEY:" + key + " ,  VALUE:"+ mapvalue);
        }
               
    }
}
