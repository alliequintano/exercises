package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Player;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class PlayerTest {

    @Test
    public void playerCanAddTo  Board() {
        Player player = new Player("X");
        Board board = new Board();

        player.takeTurn(1, 1);

        assertThat(board.state[1][1], is(player.symbol));
    }
}
