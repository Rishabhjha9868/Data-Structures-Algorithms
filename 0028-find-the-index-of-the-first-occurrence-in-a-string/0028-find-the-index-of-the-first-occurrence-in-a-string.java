class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            int temp = i;
            boolean flag = true;
            for(int j=0; j<needle.length(); j++) {
                if(haystack.charAt(temp) != needle.charAt(j)) {
                    flag = false;
                    break;
                } temp++;
            }
            if(flag) return i;
        }
        return -1;
    }
}