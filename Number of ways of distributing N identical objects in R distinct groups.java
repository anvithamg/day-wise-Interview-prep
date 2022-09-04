/*Given two integers N and R, the task is to calculate the number of ways to distribute N identical objects into R distinct groups.

Examples: 

Input: N = 4, R = 2 
Output: 5 */
import java.util.*;
class HelloWorld {
    public static int fact(int n){
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int r = obj.nextInt();
        int nFact = fact(n+r-1);
        int rFact = fact(r-1);
        int nMinusrFact = fact(n+r-1-(r-1));
        int ans = nFact/(rFact*(nMinusrFact));
        System.out.println(ans);
    }
}
