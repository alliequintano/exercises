package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Game;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

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

    @Test
    public void shouldEndGameWhenBoardHasColumnOfSameSymbol() {
        Game game = new Game();
        Board board = Board.getInstance();

        board.addIfFieldIsOpen("Z",1, 0);
        board.addIfFieldIsOpen("Z",1, 1);
        board.addIfFieldIsOpen("Z",1, 2);

        assertTrue(game.isGameOver());
    }

}
