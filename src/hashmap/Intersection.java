package hashmap;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set< Integer> st = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).filter(st::remove).toArray();
    }
}
