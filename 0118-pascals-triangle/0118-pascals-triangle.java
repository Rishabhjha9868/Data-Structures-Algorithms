class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        for(int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    list.add(1);
                } else {
                    list.add(dp.get(j)+dp.get(j-1));
                }
            }
            result.add(new ArrayList<>(list));
            dp = list;
        }
        return result;
    }
}