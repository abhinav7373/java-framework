/// treeSet : in which element will be in sorted form and its time compexity will be O(logn)
import java.util.HashSet;
public class hashSet {
    public static void main(String []args){
        HashSet<Integer> no = new HashSet<>();// same as linked hashset where element will not be insert randomly
        //they is follow step by step process

    // to insert element in set

         no.add(20);
         no.add(23);
         no.add(30);
         no.add(40);
         System.out.println(no);

    // to remove element from set 
         no.remove(30);
         System.out.println(no);

    //  to check that element is in the set or not

         System.out.println(no.contains(20));

         System.out.println(no.isEmpty());

         System.out.println(no.size());

         no.clear();
         System.out.println(no);
    }
}
