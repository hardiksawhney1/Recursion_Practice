public class parameter_sum{
    //sum of first N numbers
    public static void sum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        int sum=0;
        int n = 5;
        sum(n,sum);
    }
}