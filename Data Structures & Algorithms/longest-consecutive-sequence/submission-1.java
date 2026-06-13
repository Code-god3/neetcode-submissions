class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 1;
        for(int num : nums){
            
            int count = 1;

            if(!set.contains(num - 1)){
                while(set.contains(num+count)){
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
