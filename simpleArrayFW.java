import java.util.Arrays;
public class simpleArrayFW {
    public static void main(String []args){
    
        //for searching 

    int no[] = {1,2,3,4,5,6};
    int ans = Arrays.binarySearch(no , 4);
    System.out.println("tne no is found at index "+ans);

      

// for sorting

    int nu[] = {21,23,54,34,22};
    Arrays.sort(nu);
    for(int i : nu){
        System.out.print(i+" ");
    }
    System.out.println();



// for fill same element

  int num[] = new int[5];
  Arrays.fill(num , 2);
  for(int i : num){
    System.out.print(i+" ");

}
}
}

