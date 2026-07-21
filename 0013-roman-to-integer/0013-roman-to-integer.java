class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int temp = 0;
        int result = 0;
        for(int i=0; i<s.length(); i++) {
            if(i==0) {
                temp = map.get(s.charAt(i));
            } else if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                temp = map.get(s.charAt(i)) - temp;
            } else {
                result += temp;
                temp = map.get(s.charAt(i));
            }
        }
        result += temp;
        return result;
    }
}