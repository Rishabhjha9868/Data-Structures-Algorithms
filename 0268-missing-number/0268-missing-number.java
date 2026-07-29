class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = (size*(size+1))/2;
        int ans = 0;
        for(int i=0; i<size; i++) {
            ans += nums[i];
        }
        return sum - ans;
    }
}