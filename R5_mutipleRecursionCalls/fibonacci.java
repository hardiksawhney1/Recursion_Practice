package R5_mutipleRecursionCalls;
//recursion calls = time complexity : exponential : 2^n;
//fibonaaci : 0 1 1 2 3 5...
//n==1 answer: 0, n==2 answer: 1 , always
public class fibonacci {
    public static int fibo(int n){
        if(n<=2){
            return n-1;
        }
        int last = fibo(n-1);
        int slast = fibo(n-2);
        return last+slast;
        //firstly n-1 goes and usme n-1 and 
        // then usme bhi n-1 jab tak base condition hit na ho
        // and then back to just previous step and fir usme 
        // slast run hoga fir usme se last + slast jaega and usey
        // previous wale slast run hoga.....
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
}
