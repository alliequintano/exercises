package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Game;
import TicTacToe.Player;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class GameTest {

    @Test
    public void shouldEndGameWhenBoardIsFull() {
        Board board = new Board( new String[][] {
                {"X", "X", "X"},
                {"X", "X", "X"},
                {"X", "X", "X"}
        });
        Game game = new Game(board, new Player("X"), new Player("O"));

        assertTrue(game.isGameOver());
    }

    @Test
    public void shouldEndGameWhenBoardHasRowOfSameSymbol() {
        Board board = new Board( new String[][] {
                { "X", "X", "X"},
                { "_", "_", "_"},
                { "_", "_", "_"}
        });
        Game game = new Game(board, new Player("X"), new Player("O"));

        assertTrue(game.isGameOver());
    }

    @Test
    public void shouldEndGameWhenBoardHasColumnOfSameSymbol() {
        Board board = new Board( new String[][] {
                { "X", "_", "_"},
                { "X", "_", "_"},
                { "X", "_", "_"}
        });
        Game game = new Game(board, new Player("X"), new Player("O"));

        assertTrue(game.isGameOver());
    }

    @Test
    public void shouldReturnTrueWhenBoardHasDiagonalOfSameSymbol() {
        Board board = new Board( new String[][] {
                { "*", "_", "_"},
                { "_", "*", "_"},
                { "_", "_", "*"}
        });
        Game game = new Game(board, new Player("X"), new Player("O"));

        assertTrue(game.isGameOver());
    }

}
