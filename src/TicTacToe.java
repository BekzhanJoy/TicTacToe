class TicTacToe {
    char[][] board = new char[3][3];
    public TicTacToe() {
        initializeBoard();
    }

    public void initializeBoard(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j]=' ';
        }
    }
}
    public void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j<2){
                    System.out.print(board[i][j] + "|");
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
            System.out.println("-----");
        }
        System.out.println();
    }
    public boolean makeMove(int row, int column, char symbol) {
        if (board[row][column] == ' ') {
            board[row][column] = symbol;
            return true;
        } else {
            System.out.println("Cell already occupied! Try again.");
            return false;
        }
    }

    public boolean checkWinner(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) || (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        if((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) || (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

