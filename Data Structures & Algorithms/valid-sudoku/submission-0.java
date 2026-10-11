class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        // loop through board
        for (int r=0; r<9; r++){
            for (int c=0; c<9; c++){
                char curr = board[r][c];
                //while the spot is not empty
                if (curr != '.'){
                    String rowseen = curr + "in row" + r;
                    String colseen = curr + "in col" + c;
                    String sqrseen = curr + "in sqaure" + (r / 3) + "_" 
                    + (c / 3);
                    if (seen.contains(rowseen) || seen.contains(colseen) 
                    || seen.contains(sqrseen)){

                        return false;
                    }
                    seen.add(rowseen);
                    seen.add(colseen);
                    seen.add(sqrseen);
                }
            }
        }
    return true;
    }
}
