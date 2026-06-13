class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> list = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int ans = target - nums[i];
            if(list.get(ans) != null){
                return new int[]{list.get(ans),i};
            }
            list.put(nums[i], i);
        }
        return new int[]{0,0};
        
          
    }
}
