public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

/*
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int n[] = {1, 2, 3, 4, 5, 1, 1, 1};
        System.out.println(majorityElement(n));
    }

    public static int majorityElement(int[] nums) {
        System.out.println("Start to check!");
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            hashMap.put(nums[i], count);
        }

        Iterator iter = hashMap.entrySet().iterator();
        int majorityElement = 0;
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int) entry.getKey();
            int val = (int) entry.getValue();
            if (val > nums.length/2) {
                majorityElement = key;
                break;
            }
        }
        return majorityElement;
    }
}
*/

