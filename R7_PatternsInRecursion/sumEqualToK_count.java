package R7_PatternsInRecursion;

public class sumEqualToK_count{
    public static int sub(int i,int[] arr, int n,int k, int sum){

        //if sum>k then it is false case
        if(sum>k) return 0;
        if(i==n){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        
        sum+=arr[i];
        int l = sub(i+1,arr,n,k,sum);
        sum-=arr[i];
        int r = sub(i+1,arr,n,k,sum);
        return r+l;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr={1,2,1};
        int sum =0 ;
        int k=2;
    
        System.out.println(sub(0,arr,n,k,sum));
    }
}

