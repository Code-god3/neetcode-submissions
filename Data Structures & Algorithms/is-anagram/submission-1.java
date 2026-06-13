class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        List<Character> letter = new ArrayList<>();
        for(int a=0;a<t.length();a++){
            letter.add(t.charAt(a));
        }
        for(int a=0;a<t.length();a++){
            if(!letter.contains(s.charAt(a))){
                return false;
            }
            letter.remove(Character.valueOf(s.charAt(a)));
        }
        return true;
    }
}
