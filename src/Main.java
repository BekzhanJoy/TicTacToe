import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';

        while (true) {
            game.displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0, 1, or 2):");

            int row = sc.nextInt();
            int column = sc.nextInt();

            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Invalid input. Please enter values between 0 and 2.");
                continue;
            }

            if (game.makeMove(row, column, currentPlayer)) {
                if (game.checkWinner(currentPlayer)) {
                    game.displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                if (game.isBoardFull()) {
                    game.displayBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }

            }
        }
        sc.close();
    }
}