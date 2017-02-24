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
        Game game = new Game(new String[][] {
                { "X", "X", "X"},
                { "X", "X", "X"},
                { "X", "X", "X"}
        });
        assertTrue(game.isGameOver());
    }

    @Test
    public void shouldEndGameWhenBoardHasRowOfSameSymbol() {
        Game game = new Game(new String[][] {
                { "X", "X", "X"},
                { "_", "_", "_"},
                { "_", "_", "_"}
        });

        assertTrue(game.isGameOver());
    }

    @Test
    public void shouldEndGameWhenBoardHasColumnOfSameSymbol() {
        Game game = new Game( new String[][] {
                { "X", "_", "_"},
                { "X", "_", "_"},
                { "X", "_", "_"}
        });

        assertTrue(game.isGameOver());
    }

}
