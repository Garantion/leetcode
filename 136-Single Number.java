//也就是说对同一个字符进行两次异或运算就会回到原来的值。
public class Solution {
    public int singleNumber(int[] nums) {
        if ( nums == null || nums.length == 0 ){
             throw new IllegalArgumentException();
        } 
        for( int i = 1 ; i < nums.length ; i++ ){
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}