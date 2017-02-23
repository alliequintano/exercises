package TicTacToe;


import java.util.Arrays;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Board {
    public static String[][] state;

    private Board() {
        state = new String[][]{
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };
    }

    private static class BoardHolder {
        private static Board INSTANCE = new Board();
    }

    public static Board getInstance() {
        return BoardHolder.INSTANCE;
    }

    public static void add(String symbol, int col, int row) {
        state[col][row] = symbol;
    }

    public static void printState() {
        for (String[] col : state) {
            for (String field : col) {
                System.out.print(field);
            }
            System.out.println();
        }
    }
}
