package TwoSum;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - nums[i])) {

                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(num, i);
        }

        return null;
    }
}
