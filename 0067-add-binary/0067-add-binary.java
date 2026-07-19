class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pos1 = a.length()-1;
        int pos2 = b.length()-1;
        int carry = 0;
        while(pos1>=0 && pos2>=0) {
            int sum = (a.charAt(pos1)-'0') + (b.charAt(pos2)-'0') + carry;
            sb.append(sum%2);
            carry = sum/2;
            pos1--;
            pos2--;
        }
        while(pos1>=0) {
            int sum = (a.charAt(pos1)-'0') + carry;
            sb.append(sum%2);
            carry = sum/2;
            pos1--; 
        }
         while(pos2>=0) {
            int sum = (b.charAt(pos2)-'0') + carry;
            sb.append(sum%2);
            carry = sum/2;
            pos2--; 
        }
        return (carry == 0) ? sb.reverse().toString() : sb.append(carry).reverse().toString();
    }
}