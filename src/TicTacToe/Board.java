package TicTacToe;


import java.util.Arrays;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Board {
    private String[][] state;

    public Board(String[][] state) {
        this.state = state;
    }

    public String[][] getState() {
        return state;
    }

    public boolean addIfFieldIsOpen(String symbol, int col, int row) {
        if (!fieldIsTaken(col, row)) {
            state[col][row] = symbol;
            return true;
        } else {
            return false;
        }
    }
    private boolean fieldIsTaken(int col, int row) {
        if (state[col][row] != "_")
            return true;
        return false;
    }

    public boolean isFull() {
        for (String[] col : state) {
            for (String field : col) {
                if (field == "_")
                    return false;
            }
        }
        return true;
    }

    public boolean hasThreeInARow() {
        for (String[] row : state) {
            int count = 0;
            for (String field : row) {
                if (field == row[0] && row[0] != "_")
                    count++;
                if (count == 3) return true;
            }
        }
        return false;
    }

    public boolean hasThreeInAColumn() {
        for (int col = 0; col < 3; col++) {
            int count = 0;
            for (int row = 0; row < 3; row++)
                if (state[row][col] == state[0][col] && state[0][col] != "_")
                    count++;
            if (count == 3) return true;
        }
        return false;
    }

    public boolean hasThreeInADiagonal() {
        if (state[1][1] != "_") {
            if ((state[1][1] == state[0][0] && state[1][1] == state[2][2]) ||
                    (state[1][1] == state[0][2] && state[1][1] == state[2][0]))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public void printState() {
        for (String[] col : state) {
            for (String field : col) {
                System.out.print(field);
            }
            System.out.println();
        }
    }
}
