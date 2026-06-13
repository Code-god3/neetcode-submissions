class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] letter = s.toCharArray();
            Arrays.sort(letter);
            String value = String.valueOf(letter);

            if(!map.containsKey(value)){
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
