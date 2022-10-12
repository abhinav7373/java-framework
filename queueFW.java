import java.util.LinkedList;
import java.util.Queue;
public class queueFW {
    public static void main(String []args){
        Queue<String> animals = new LinkedList<>();

        // push or insert element in queue using linkedlist


        animals.offer("cat");
        animals.offer("mouse");
        animals.offer("dog");
        System.out.println(animals);

        //to remove element we use poll

        System.out.println(animals.poll());
        System.out.println(animals);

        // peek whick denote that which element is ready to remove from linkedlist

        System.out.println(animals.peek());
        System.out.println(animals);
    }
}
