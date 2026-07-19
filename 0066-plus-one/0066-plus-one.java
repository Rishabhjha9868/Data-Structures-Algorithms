class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int carry = 1;
        for(int i= size-1; i>=0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry != 0) {
            int[] arr = new int[size+1];
            arr[0] = carry;
            for(int i=1; i<size+1; i++) {
                arr[i] = digits[i-1];
            }
            return arr;
        }
        return digits;
    }
}