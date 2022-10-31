import java.util.Collections;
import java.util.ArrayList;
public class collectionFW {
    public static void main(String []args){
        ArrayList<Integer> no = new ArrayList<>();
        no.add(12);
        no.add(32);
        no.add(5);
        no.add(22);
        System.out.println(Collections.min(no));
        Collections.sort(no);
        System.out.print(no);
    }
