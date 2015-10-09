public class Solution {
    public boolean isHappy(int n) {
        if(n < 1)   return false;
        HashSet<Integer> hashSet = new HashSet<>();

        while (n < Integer.MAX_VALUE){
            if(hashSet.contains(n)){
                return false;
            }else{
                hashSet.add(n);
            }
            n = digitSquare(n);
            if (n == 1){
                return true;
            }
        }
        return false;
    }
    private int digitSquare(int n){
        int sum = 0;
        while(n != 0){
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
