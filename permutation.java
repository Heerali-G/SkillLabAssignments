//Permutation in String
//Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
import java.util.Hashtable;

public class permutation {
    public static boolean containsPermutation(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        Hashtable<Character, Integer> table = new Hashtable<>();
        for (char c : s1.toCharArray()) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }
        int matchCount = 0;
        for (int i = 0; i < len2; i++) {
            char newChar = s2.charAt(i);
            if (table.containsKey(newChar)) {
                table.put(newChar, table.get(newChar) - 1);
                if (table.get(newChar) == 0) {
                    matchCount++;
                }
            }
            if (i >= len1) {
                char oldChar = s2.charAt(i - len1);
                if (table.containsKey(oldChar)) {
                    if (table.get(oldChar) == 0) {
                        matchCount--;
                    }
                    table.put(oldChar, table.get(oldChar) + 1);
                }
            }
            if (matchCount == table.size()) {
                return true;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "eidacbaooo";
        System.out.println(containsPermutation(s1, s2));
    }
}
