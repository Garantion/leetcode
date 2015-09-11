public class Solution {
    public int addDigits(int num) {
        return (num-1)%9+1;
    }
}
/*
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num = 19;

        System.out.println("result:"+addDigits(num));
    }
    public static int addDigits(int num) {
        String test = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < test.length() ; i++) {
            result += num % 10;
            num = num / 10;
            System.out.println("Temp result:"+result);
            System.out.println("Temp num:"+num+"");
        }
        return result;
    }
}
*/
