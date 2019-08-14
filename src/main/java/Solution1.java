import java.util.Arrays;

public class Solution1 implements Solution {
    @Override
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int start = i+1, end = nums.length-1;
            while (start < end) {
                if (Math.abs(nums[i]+nums[start]+nums[end]-target) < Math.abs(result == Integer.MAX_VALUE && target < 0 ? result+target : result-target)) {
                    result = nums[i]+nums[start]+nums[end];
                    start++;
                } else if (nums[i]+nums[start]+nums[end]-target < -result) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return result;
    }
}
