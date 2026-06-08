import java.util.*;

class Solution {
    public Map<Character, Integer> freqCounter(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 0);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }

        }
            return mp;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        Map<Character, Integer> sp = freqCounter(s);
        Map<Character, Integer> tp = freqCounter(t);
        return sp.equals(tp);

    }
}