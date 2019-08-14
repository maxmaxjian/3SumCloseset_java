import java.util.Arrays;

public class Solution2 implements Solution {
    @Override
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (Math.abs(nums[i]+nums[j]+nums[k]-target) <
                            Math.abs(result == Integer.MAX_VALUE && target < 0 ? result+target : result-target)) {
                        result = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }

        return result;
    }
}
