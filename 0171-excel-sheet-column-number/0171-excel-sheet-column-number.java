class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int power = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result += value * (int) Math.pow(26, power);
            power++;
        }

        return result;
    }
}