package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List< Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] + nums[i+1] + nums[i+2] > 0) break;
            if (nums[i] + nums[n-2] + nums[n-1] < 0) continue;
            int x = nums[i];
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (x + nums[j] + nums[k] > 0) k--;
                else if (x + nums[j] + nums[k] < 0) j++;
                else {
                    if (j == i + 1 || nums[j] != nums[j-1]){
                        ans.add(List.of(x, nums[j], nums[k]));
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
