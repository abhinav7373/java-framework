import java.util.HashMap;
import java.util.Map;
public class hashmapFW {
    public static void main(String []args){
         HashMap<String , Integer> no = new HashMap<>();


         // for inserting we use put


        no.put("one",1);
        no.put("two",2);
        no.put("three",3);
        System.out.println(no);

        // it allow over writing to reduce over writing we use if 
        // if condition

        no.put("one",20);
        System.out.println(no);
        if(!no.containsKey("one")){
            no.put("one",12);
        }
        no.putIfAbsent("two",20);
        System.out.println(no);

        //for iteration we use entry set 

        for(Map.Entry<String,Integer> p: no.entrySet()){
        System.out.println(p);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        }
        for(String key : no.keySet()){
            System.out.println(key);
        }

        // we use contains to check value is in it or not
        System.out.println(no.containsValue(29));
        // to check empty or not

        System.out.println(no.isEmpty());

        // to clear map
        no.clear();
        System.out.println(no);

        // tree hash is same as hashmap 
        //here is key will be in sorted form
        // and it has remove function also
    }
}
