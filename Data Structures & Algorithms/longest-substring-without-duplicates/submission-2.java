class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left  =0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            while(window.contains(current)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(current);
            int len = i-left+1;
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}
