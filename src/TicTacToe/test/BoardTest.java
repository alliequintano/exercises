package TicTacToe.test;

import TicTacToe.Board;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class BoardTest {

    @Test
    public void shouldAddSymbolToBoardAtPosition() {
        Board board = new Board( new String[][]{
                new String[] {"_", "_", "_"},
                new String[] {"_", "_", "_"},
                new String[] {"_", "_", "_"}
        });

        board = board.addToBoard("X", new int[] {1,1});

        assertThat(board.getState()[1][1], is("X"));
    }

    @Test
    public void shouldNotAddToBoardWhenFieldAlreadyTaken() {
        Board board = new Board( new String[][]{
                new String[] {"O", "_", "_"},
                new String[] {"_", "_", "_"},
                new String[] {"_", "_", "_"}
        });

        board.addToBoard("X", new int[] {0,0});

        assertThat(board.getState()[0][0], is("O"));
    }

    @Test
    public void shouldReturnTrueWhenBoardHasColumnOfSameSymbol() {
        Board board = new Board( new String[][] {
                new String[] { "X", "_", "_"},
                new String[] { "X", "_", "_"},
                new String[] { "X", "_", "_"}
        });

        assertTrue(board.hasThreeInAColumn());
    }

    @Test
    public void shouldReturnTrueWhenBoardHasRowOfSameSymbol() {
        Board board = new Board( new String[][] {
                new String[] { "_", "_", "_"},
                new String[] { "O", "O", "O"},
                new String[] { "_", "_", "_"}
        });

        assertTrue(board.hasThreeInARow());
    }

    @Test
    public void shouldReturnTrueWhenBoardHasDiagonalOfSameSymbol() {
        Board board = new Board(new String[][] {
                new String[] { "*", "_", "_"},
                new String[] { "_", "*", "_"},
                new String[] { "_", "_", "*"}
        });

        assertTrue(board.hasThreeInADiagonal());
    }
}
