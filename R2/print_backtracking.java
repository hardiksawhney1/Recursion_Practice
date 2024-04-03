//Recursion:
// Print 1 to N means: 
// printing i in each recurive call and call function(i+1,n);

//Backtracking:
// Also, Print 1 to N in  backtracking means:
// starting with (n,n)
// calling(i-1,n) in each call and in last case when 
// base case hits print(i);

//Print N to 1 using backtracing
public class print_backtracking {
    public static void print(int i, int n){
        if(i>n){
            return;
        }
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
    }
}
