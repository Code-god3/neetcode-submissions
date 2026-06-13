class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 1;
        int max = 1;
        for(int num : nums){
            while(set.contains(num - 1)){
                count++;
                num--;
            }
            max = Math.max(max,count);
            count = 1;
        }
        return max;
    }
}
