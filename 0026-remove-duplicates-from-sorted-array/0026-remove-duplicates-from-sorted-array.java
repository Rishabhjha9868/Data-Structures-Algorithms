class Solution {
    public int removeDuplicates(int[] nums) {
        int temp1 = 1;
        for(int i=1; i<nums.length; i++) {
           if(nums[i] != nums[i-1]) {
            nums[temp1++] = nums[i];
           }
        }
        return temp1;
    }
}