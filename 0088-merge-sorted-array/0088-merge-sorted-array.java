class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m+n-1;
        int ptr2 = m-1;
        int ptr3 = n-1;
        while(ptr2>=0 && ptr3>=0) {
            if(nums1[ptr2]>nums2[ptr3]) {
                nums1[ptr1] = nums1[ptr2];
                ptr1--;
                ptr2--;
            } else {
                nums1[ptr1] = nums2[ptr3];
                ptr1--;
                ptr3--;
            }
        }
        while(ptr3>=0) {
            nums1[ptr1--] = nums2[ptr3--];
        }
    }
}