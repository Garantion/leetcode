public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return String.valueOf(arrS).equals(String.valueOf(arrT));
    }
}
/*
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        System.out.println(arrS);
        Arrays.sort(arrT);
        System.out.println(arrT);
        return String.valueOf(arrS).equals(String.valueOf(arrT));
    }
}
*/

