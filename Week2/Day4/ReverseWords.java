class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word = ch + word;
            } else {
                ans += word + " ";
                word = "";
            }
        }
        ans += word;
        return ans;
    }
}