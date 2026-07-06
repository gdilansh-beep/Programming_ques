import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] dp = new int[n];
        int[] pre = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(pre, -1);

        int end = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    pre[i] = j;
                }
            }
            if (dp[i] > dp[end]) end = i;
        }

        List<Integer> ans = new ArrayList<>();
        while (end != -1) {
            ans.add(nums[end]);
            end = pre[end];
        }

        Collections.reverse(ans);
        return ans;
    }
}