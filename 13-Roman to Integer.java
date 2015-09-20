import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String romanStr = "MCMXCVI";
        System.out.println(romanToInt(romanStr));
    }
    public static int romanToInt(String s) {
        int result = 0;
        int now,temp;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('X',10);
        hashMap.put('C',100);
        hashMap.put('M',1000);
        hashMap.put('V',5);
        hashMap.put('L',50);
        hashMap.put('D',500);
        for (int i = 0; i < s.length(); i++) {
            now = hashMap.get(s.charAt(i));
            if(i == s.length() - 1)
            {
                result += hashMap.get(s.charAt(i));
                break;
            }
            temp = hashMap.get(s.charAt(i+1));
            if(now >= temp){
                result += hashMap.get(s.charAt(i));
            }
            else{
                result -= hashMap.get(s.charAt(i));
            }
        }
        return result;
    }
}

