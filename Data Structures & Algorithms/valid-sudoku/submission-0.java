class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet<String> hs = new HashSet<>();
    for (int i=0;i<9;i++) {
        for (int j=0;j<9;j++) {
            if (board[i][j] == '.') {
                continue;
            }
            if (!hs.add(board[i][j] + " in row " + i) || 
                !hs.add(board[i][j] + " in col " + j) || 
                !hs.add(board[i][j] + " in box " + (i / 3) + "-" + (j / 3)))
            return false;
        }
    }
    return true;
    }
}
