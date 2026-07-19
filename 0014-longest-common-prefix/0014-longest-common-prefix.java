class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st = new StringBuilder();
        int pointer = 0;
        while(pointer < strs[0].length()) {
            char ch = strs[0].charAt(pointer);
            for(int i=1; i<strs.length; i++) {
                if(pointer>=strs[i].length()) {
                    return st.toString();
                } else if (strs[i].charAt(pointer) != ch) {
                    return st.toString();
                }
            }
            st.append(ch);
            pointer++;
        }
        return st.toString();        
    }
}