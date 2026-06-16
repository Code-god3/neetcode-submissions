class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int[] arr = new int[26];
        int maxFrequency = 0;
        int left = 0;

        for(int right = 0;right < s.length();right++){
            arr[s.charAt(right) - 'A']++;

            maxFrequency = Math.max(maxFrequency,arr[s.charAt(right)-'A']);

            while((right - left + 1) - maxFrequency > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(right - left + 1,maxLength);
        }

        return maxLength;
    }
}
