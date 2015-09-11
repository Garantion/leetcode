public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0 || s.trim().equals("") )
        {
            return 0;
        }
        String splitString[] = s.split(" "); 
        return splitString[splitString.length-1].length();
    }
}