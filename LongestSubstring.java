//Longest Substring Without Repeating characters using sliding window.


public class LongestSubstring{
      public static int lengthOfLongestSubStr(String s) {
    int[] index = new int[256]; 
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) 
        {
            left = Math.max(index[s.charAt(right)], left);
            maxLen = Math.max(maxLen, right - left + 1);
            index[s.charAt(right)] = right + 1;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubStr(s));        
    }
}
