package arr;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        //给你一个数组 nums 和一个值 val，你需要
        // 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
        // 这就是个双指针的题目吧
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
