
// time complexity & space complexity : O(n);


public class functional_factorial {
    
    public static int factorial(int n){
        if(n==2){ //one ko multiply krke kya faida hoga else toh 
            //n==1 ki condition honi chahiye thi
            return 2;
        }
        return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
