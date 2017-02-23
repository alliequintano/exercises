package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Game;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class GameTest {

    @Test
    public void shouldEndGameWhenBoardIsFull() {
        Game game = new Game();
        Board board = Board.getInstance();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.addIfFieldIsOpen("X", i, j);
            }
        }
        assertTrue(game.isGameOver());
    }

}
