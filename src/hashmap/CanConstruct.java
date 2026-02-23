package hashmap;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] compare = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            compare[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (--compare[magazine.charAt(i) - 'a'] > 0) {
                return false;
            }
        }
        return true;
    }
}
