class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numbers = new HashMap<>();
       for(int i = 0; i<nums.length;i++) {
        int want = target - nums[i];
        if(numbers.containsKey(want)){
            return new int[]{numbers.get(want),i};
        }
        numbers.put(nums[i],i);
       }
       return new int[] {-1,-1};
    }
}