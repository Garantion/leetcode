public class Solution {
    public String convertToTitle(int n) {
        StringBuffer strBuf = new StringBuffer();
        while(n > 0){
            n--;
            char temp = (char)((n%26)+(int)'A');
            strBuf.append(temp);
            n /= 26;
        }
        return strBuf.reverse().toString();
    }
}