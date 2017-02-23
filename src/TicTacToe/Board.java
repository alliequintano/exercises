package TicTacToe;


import java.util.Arrays;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Board {
    public static String[][] state;

    public Board() {
        state = new String[][]{
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        };
    }

    public static void add(String symbol, int col, int row) {
        state[col][row] = symbol;
    }
}
