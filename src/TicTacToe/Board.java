package TicTacToe;


/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Board {
    private final String[][] state;

    public Board(String[][] state) {
        this.state = state;
    }

//    only using this method for tests :(
    public String[][] getState() {
        return state;
    }

    public Board addToBoard(String symbol, int[] coordinates) {
        String[][] newState = new String[3][3];
        for (int i = 0; i < state[0].length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                newState[i][j] = state[i][j];
            }
        }
        newState[coordinates[0]][coordinates[1]] = symbol;
        return new Board(newState);
    }

    public boolean fieldIsOpen(int[] coordinates) {
        if (state[coordinates[0]][coordinates[1]] == "_")
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
//        state
//                .stream()
//                .map(_.stream().filter(_ == 'X').length)

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
