public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    //n>>=1 就类似于 n+=1，等同于n = n>>1，即n变成n向右移一位的那个数
        int result = 0;
        while(n != 0){
            result += n & 1;
            n >>>= 1;
        }
        return result;
    }
}