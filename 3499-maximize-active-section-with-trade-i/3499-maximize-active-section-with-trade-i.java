class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ans = 0, pre = Integer.MIN_VALUE, best = 0;
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            int len = j - i;
            if (s.charAt(i) == '1') {
                ans += len;
            } else {
                best = Math.max(best, pre + len);
                pre = len;
            }
            i = j;
        }
        return ans + best;
    }
}