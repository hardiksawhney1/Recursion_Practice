package R8_mergeSort;

import java.util.ArrayList;

public class mergeSort {
    public static void merge(int low,int mid, int high, int[]arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void ms(int low, int high, int[] arr){
        if(low==high) return;
        int mid = (low+high)/2;
        ms(low,mid,arr);
        ms(mid+1,high,arr);
        merge(low,mid,high,arr);
    }
    public static void main(String[] args) {
        int n = 9;
        int arr[] = {2,5,6,8,9,4,3,2,4};
        System.out.println("Initial Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        ms(0,n-1,arr);

        System.out.println();
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
