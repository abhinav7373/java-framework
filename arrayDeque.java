import java.util.ArrayDeque;
public class arrayDeque {
    public static void main(String []args){
        ArrayDeque<Integer> no = new ArrayDeque<>();

        // to push element into deqeue
        no.offer(12);
        no.offer(24);
        no.offerFirst(39);
        no.offer(40);
        System.out.println(no);


        //to remove element we use poll

        System.out.println(no.pollLast());
        System.out.println(no);

        // peek whick denote that which element is ready to remove from linkedlist

        System.out.println(no.peekLast());
        System.out.println(no);
    }
    }

