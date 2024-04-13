package R7_PatternsInRecursion;

import java.util.ArrayList;

public class sumEqualToK_oneAns {
    public static boolean sub(int i,int[] arr, ArrayList<Integer> list, int n,int k, int sum){
        if(i==n){
            if(sum==k){
                for(int x:list){
                    System.out.print(x+" ");
                }
                return true;
            }
            return false;
        }
        
        list.add(arr[i]);
        sum+=arr[i];
        if(sub(i+1,arr,list,n,k,sum)==true){
            return true;
        }
        list.remove(list.size()-1);
        sum-=arr[i];
        if(sub(i+1,arr,list,n,k,sum)==true){
            return true;
        }
        return false;
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

