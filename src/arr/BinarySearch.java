package arr;

public class BinarySearch {
    /*给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target
    ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1 */
    public static int binarySearch(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                return mid;
                //自己跑了一下，才发现mid+1、mid-1很关键
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
