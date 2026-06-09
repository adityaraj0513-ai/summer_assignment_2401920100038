class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256];

        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }

        int startIdx = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastSeen[ch] >= startIdx) {
                startIdx = lastSeen[ch] + 1;
            }

            lastSeen[ch] = i;
            ans = Math.max(ans, i - startIdx + 1);
        }

        return ans;
    }
}