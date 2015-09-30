public class Solution {
    public int climbStairs(int n) {
            int result = 0;
            int a = 1;
            int b = 0;
            for(int i = 0; i < n; i++){
                result = a + b;
                b = a;
                a = result;
            }
            return result;
    }
}
