public class permutationsInString {
    public boolean arrayisSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i <= s2.length() - windowSize; i++) {
            int[] windowFreq = new int[26];

            for (int j = i; j < i + windowSize; j++) {
                windowFreq[s2.charAt(j) - 'a']++;
            }

            if (arrayisSame(freq, windowFreq))
                return true;
        }

        return false;
    }
} 
    

