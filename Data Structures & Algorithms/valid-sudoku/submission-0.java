class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[board.length];
        HashSet<Character>[] cols = new HashSet[board[0].length];
        HashSet<Character>[] squares = new HashSet[board.length];
        // func off assumption that square grids have same amt
        // of squares as length of board

        for (int i = 0; i < board.length; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            squares[i] = new HashSet<Character>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char curr = board[i][j];
                if (curr == '.') continue;
                if (rows[i].contains(curr) ||
                    cols[j].contains(curr) ||
                    squares[3*(i/3) + (j/3)].contains(curr)) return false;
                rows[i].add(curr);
                cols[j].add(curr);
                squares[3*(i/3) + (j/3)].add(curr);
            }
        }
        return true;
    }
}
