class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x<0) return false;
        int result = 0;
        while(x>0) {
            int rem = 0;
            rem = x%10;
            result = result*10 + rem;
            x = x/10;
        }
        return (temp == result) ? true: false;
    }
}