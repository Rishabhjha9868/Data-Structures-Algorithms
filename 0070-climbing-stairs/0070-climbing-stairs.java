class Solution {
    private int climb(int n,int[] dp) {
        if(n <= 2) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        dp[n] = climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        return climb(n,dp);
    }
}