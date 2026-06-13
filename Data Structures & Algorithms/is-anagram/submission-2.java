class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charAt1 = s.toCharArray();
        char[] charAt2 = t.toCharArray();
        Arrays.sort(charAt1);
        Arrays.sort(charAt2);

        return String.valueOf(charAt1).equals(String.valueOf(charAt2));
    }
}
