package TicTacToe;

import java.util.Scanner;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Player {
    public String symbol;
    Scanner input = new Scanner(System.in);

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public void takeTurn() {
        System.out.println("Enter a position: ");
        int col = input.nextInt();
        int row = input.nextInt();
        Board.add(this.symbol, col, row);
    }
}
