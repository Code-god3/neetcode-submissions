class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();  
        String row;
        String col;
        String box;
        char val;   
        for(int r = 0;r < 9; r++){
            for(int c = 0; c < 9; c++){
                val = board[r][c];
                if(val != '.'){
                    row = val + "row" + r;
                    col = val + "col" + c;
                    box = val + "box" + r/3 + "-" + c/3;
                     if(!set.add(row)||!set.add(col)||!set.add(box)){
                    return false;
                }
                }
               
            }

        }
        return true;
    }
}
