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
    public static boolean addIfFieldIsOpen(String symbol, int col, int row) {
        if (!fieldIsTaken(col, row)) {
            state[col][row] = symbol;
            return true;
        } else {
            return false;
        }
    }

    private static boolean fieldIsTaken(int col, int row) {
        if (state[col][row] != "_")
            return true;
        return false;
    }

    public static boolean isFull() {
        for (String[] col : state) {
            for (String field : col) {
                if (field == "_")
                    return false;
            }
        }
        return true;
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
