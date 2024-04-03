package R4;

public class reverseArray_2pointer {
    public static void reverse(int[] arr, int left, int right){
        if(left>=right) return;
        swap(arr, left, right);
        reverse(arr,left+1,right-1);
    }
    public static void swap(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 6;
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
