public class Solution {
    public double myPow(double x, int n) {
     //   if(x==0) return 0;
        if(n==0) return 1;
        if(n==1) return x;
        if(n<0) {
            x = 1/x;
            n = Math.abs(n);
        }
        double half = myPow(x, n/2);
        return half*half*((n%2==0)?1:x);
    }
}