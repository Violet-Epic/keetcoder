package hashmap;

import java.util.*;

public class IntersectionPlain {
    public int[] intersection(int[] nums1, int[] nums2) {
        //
        Set< Integer> st = new HashSet<>();
        for (int i: nums1) {
            st.add(i);
        }
        List< Integer> lst = new ArrayList<>();
        for (int i: nums2) {
            if (st.remove(i)) {
                lst.add(i);
            }
        }
//        return st.stream().mapToInt(Integer::intValue).toArray();
        int[] ans = new int[lst.size()];
        for (int i: lst) {
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
