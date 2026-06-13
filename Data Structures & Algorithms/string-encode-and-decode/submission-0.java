class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String str : strs){
            encodedStr.append(str.length()).append('#').append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            String original = str.substring(i,i+length);
            decodedList.add(original);
            i = i + length ;
        }
        return decodedList;
    }
}
