import java.util.Scanner;

public class Human {
    String name;
    char move;
    public Human(String name, char move) {
        this.name = name;
        this.move = move;
    }

    public void makeMove() {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do {
            row = sc.nextInt();
            col = sc.nextInt();
        } while (!isValidMove(row, col));
        TicTacToe.placeMark(row, col, move);
    }

    public boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (TicTacToe.board[row][col] == ' ') return true;
        }
        return false;
    }
}
