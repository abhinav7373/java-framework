import java.util.PriorityQueue;
import java.util.Queue;
public class priorityQuFW {
    public static void main(String []args){
        Queue<Integer> pq = new PriorityQueue<>();
  // for max heap we use comparator 

        // it using heap concept min heap


        pq.offer(40);
        pq.offer(10);
        pq.offer(50);
        System.out.println(pq);

        // we use poll which remove highest priority element

        pq.poll();
        System.out.println(pq);
    }
}
