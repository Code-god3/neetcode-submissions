class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> group = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            if(!group.containsKey(sortedStr)){
                group.put(sortedStr,new ArrayList<String>());
            }
            group.get(sortedStr).add(s);
        }
        return new ArrayList<>(group.values());
    }
}
