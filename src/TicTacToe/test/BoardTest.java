package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Player;
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

        Board.add("X", 1, 1);

        assertThat(board.state[1][1], is("X"));
    }

    @Test
    public void shouldNotAddToBoardWhenFieldAlreadyTaken() {

    }
}
