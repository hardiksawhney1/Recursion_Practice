package R7_PatternsInRecursion;

import java.util.ArrayList;

public class sumEqualToK {
    public static void sub(int i,int[] arr, ArrayList<Integer> list, int n,int k, int sum){
        if(i==n){
            if(sum==k){
                for(int x:list){
                    System.out.print(x+" ");
                }
            System.out.println();
            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];
        sub(i+1,arr,list,n,k,sum);
        list.remove(list.size()-1);
        sum-=arr[i];
        sub(i+1,arr,list,n,k,sum);
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr={1,2,1};
        int sum =0 ;
        int k=2;
        ArrayList<Integer> list = new ArrayList<>();
        sub(0,arr,list,n,k,sum);
    }
}
