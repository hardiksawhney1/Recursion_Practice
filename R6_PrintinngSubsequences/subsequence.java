package R6_PrintinngSubsequences;

//time complexity: (2^n)*n .... 2^n for recursion calls 
//and n for printing each sequence

//space complexity: O(n) i.e., the max stack size
import java.util.ArrayList;

//recursion tree is also attached for reference
//what we are doing at every step is either that element at that index
// or we don't take that element
//first we take find futher sequences and then remove it 
//thing what if we have had never taken it and then
//we do i+1 and add next element
public class subsequence {
    public static void findsub(int i, ArrayList<Integer> list, int[] arr, int n){
        if(i==n){
            //print subsequence
            for(int x:list){
                System.out.print(x+" ");
            }

            if(list.size()==0){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        //take the elements
        list.add(arr[i]);
        findsub(i+1, list, arr, n);
        //if we have had not taken that element
        list.remove(list.size()-1);
        //add element after it
        findsub(i+1, list, arr, n); //if u write this before list.add, order is reversed
    }
    public static void main(String[] args) {
        int n =4;
        int[] arr ={3,1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        findsub(0,list,arr,n);
    }
}
