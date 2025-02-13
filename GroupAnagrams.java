//1.Group Strings by Anagrams using hashtable

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramTable = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            anagramTable.putIfAbsent(key, new ArrayList<>());
            anagramTable.get(key).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : anagramTable.keySet()) {
            result.add(anagramTable.get(key));
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}