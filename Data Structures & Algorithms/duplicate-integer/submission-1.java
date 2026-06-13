class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i: nums){
            if(ans.contains(i)){
                return true;
            }
            ans.add(i);
        }
        return false;
    }
}