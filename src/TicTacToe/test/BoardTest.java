package TicTacToe.test;

import TicTacToe.Board;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class BoardTest {

    @Test
    public void shouldAddSymbolToBoardAtPosition() {
        Board board = Board.getInstance();

        board.addIfFieldIsOpen("X", 1, 1);

        assertThat(board.state[1][1], is("X"));
    }

    @Test
    public void shouldNotAddToBoardWhenFieldAlreadyTaken() {
        Board board = Board.getInstance();

        board.addIfFieldIsOpen("O", 0,0);
        board.addIfFieldIsOpen("X", 0,0);

        assertThat(board.state[0][0], is("O"));
    }
}
