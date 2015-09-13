public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int count = 0; count < s.length(); count++){
            result = result * 26 + s.charAt(count) - '@';
        }
        return result;
    }
}