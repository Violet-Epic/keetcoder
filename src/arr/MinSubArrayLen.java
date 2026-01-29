package arr;
import java.lang.Math;

public class MinSubArrayLen {
    //给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s
    // 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = nums.length + 1;
        int[] arr = new int[nums.length];
        for(; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                // 这里我想不通，为什么这里不要判断？题目要求>=s
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return ans > nums.length ? 0 : ans;
    }
}
