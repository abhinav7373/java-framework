import java.util.ArrayList;
public class arrayFW {
    public static void main(String []args){
        ArrayList<Integer> no = new ArrayList<>();
        no.add(1);
        no.add(2);
        System.out.println(no);
        no.add(3);
        System.out.println(no);

        //here we can add any random index using this.


        no.add(1,50); 
        System.out.println(no);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(120);
        n.add(130);
        no.addAll(1,n);
        System.out.println(no);


        //to get a elemetn


        System.out.println(no.get(1));

        //to remove element from ArrayList
        
        no.remove(0);
        System.out.println(no);
        no.remove(Integer.valueOf(120));
        System.out.println(no);

        ///to empty or clear the list we use clear()

        // no.clear();
        // System.out.println(no);

        //to update list we use set()

        no.set(1,1000);
        System.out.println(no);

        //to check elemet is in list or no

        System.out.println(no.contains(20));

        //for traversing in list we use many method like below
        // 1 is for loop

        for(int i=0;i<no.size();i++){
            System.out.println(no.get(i)+1);
        }

        // 2 is for each loop

        for(Integer ele:no){
            System.out.println(ele+2);
        }
    }
}
