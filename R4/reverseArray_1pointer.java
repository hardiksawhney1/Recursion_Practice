package R4;

public class reverseArray_1pointer {
    public static void reverse(int[]arr, int left, int n){
        if(left>=n/2) return;
        swap(arr,left,n-left-1);
        reverse(arr,left+1,n);
    }
    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,2,3,4,5,6};
        reverse(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
