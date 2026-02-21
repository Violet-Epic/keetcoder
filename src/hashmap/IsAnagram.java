package hashmap;

/*return Counter(s) == Counter(t)*/
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] cntS = new int[26];
        for (char c : s.toCharArray()) {
            cntS[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cntS[c - 'a']--;
        }
        for (int i : cntS) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
