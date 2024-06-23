//we are using recursion concept
class Solution {
    public int getSum(int a, int b) {
       int sum1 = (a&b)<<1;
       int sum2 = a^b;

       if(sum1==0)
       return sum2;

       return getSum(sum1,sum2);
    }
}
