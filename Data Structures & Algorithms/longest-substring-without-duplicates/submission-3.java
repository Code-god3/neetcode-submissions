class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int max = 0;

        for(int i = 0; i< arr.length;i++){
            int j = i;
            while(j < arr.length && set.add(arr[j])){
                j++;
            }
            max = Math.max(max,set.size());
            set.clear();
        }
        return max;
    }
}



