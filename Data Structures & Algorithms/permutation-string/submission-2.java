class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for (char i : s1.toCharArray()) {
            need.put(i, need.getOrDefault(i, 0) + 1);
        }

        int left = 0;
        int right = 0;

        while (right < s2.length()) {
            if (need.containsKey(s2.charAt(right))) {
                have.put(s2.charAt(right), have.getOrDefault(s2.charAt(right), 0) + 1);
                while (need.get(s2.charAt(right)) < have.get(s2.charAt(right))) {
                    have.put(s2.charAt(left), have.get(s2.charAt(left)) - 1);
                    if (have.get(s2.charAt(left)) == 0) {
                        have.remove(s2.charAt(left));
                    }
                    left++;
                }
                if (right - left + 1 == s1.length()) {
                    return true;
                }
                right++;
            } else {
                have.clear();
                right++;
                left = right;
            }
        }
        return false;
    }
}
