package R4;

public class check_Palindrome {
    public static boolean check(String str, int i, int n){
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-i-1)) return false;
        return check(str,i+1,n);
    }
    public static void main(String[] args) {
        String str = "madamm";
        System.out.println(check(str,0,str.length()));
    }
}
