package arr;

public class SortedSquares {
    //给你一个按非递减顺序排序的整数数组 nums，
    // 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
    public static int[] sortedSquares(int[] nums) {
        // 好奇怪的题目，第一反应是重新排序。
        //一下子就给出了一个好的思路，创建一个新数组，然后双指针吗？
        int[] res = new int[nums.length];
        for (int i = 0, j = nums.length - 1, k = nums.length - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[k--] = nums[i] * nums[i];
                i++;
            } else {
                res[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
// 代码补全带给了我外置大脑，无敌了 。
