package TicTacToe;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Player {
    public String symbol;

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public void takeTurn(int col, int row) {
        Board.add(this.symbol, col, row);
    }
}
