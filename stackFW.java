import java.util.Stack;
public class stackFW {
    public static void main(String []args){
        Stack<Integer> no = new Stack<>();


        // to push or insert element in stack


        no.push(1000);
        no.push(2000);
        no.push(3000);
        System.out.println(no);

        //to check top most element in stack


        System.out.println(no.peek());

        //to pop or delete element from stack

        no.pop();
        System.out.println(no);
    }
}
