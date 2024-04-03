public class parameter_factorial {
    
    public static void factorial(int n, int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        factorial(n-1,fact*n);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        factorial(n,fact);
    }
}
