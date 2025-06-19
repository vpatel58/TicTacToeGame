import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("Tic Tac Toe");
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//        frame.setLayout(new GridLayout(3, 3));
//
//        for (int i = 1; i <= 9; i++) {
//            frame.add(new JButton(" "));
//        }
        TicTacToe t = new TicTacToe();
        Human h1 = new Human("Vishu", 'X');
        Human h2 = new Human("Romin", 'O');
        Human h;
        h = h1;
        while (!t.checkWinner()) {
            t.displayBoard();
            if (t.isDraw()) {
                t.initBoard();
                t.displayBoard();
            }
            System.out.println(h.name + " Turn.");
            h.makeMove();
            if (t.checkWinner()) {
                System.out.println(h.name + " has won.");
            }
            if (h == h1) {
                h = h2;
            } else {
                h = h1;
            }
        }

    }
}