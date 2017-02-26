package TicTacToe.test;

import TicTacToe.Board;
import TicTacToe.Game;
import TicTacToe.Player;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class GameTest {

//    @Test
//    public void shouldNotAddToBoardWhenFieldAlreadyTaken() {
//        Player player1 = new Player("X");
//        Board board = new Board( new String[][]{
//                new String[] {"O", "_", "_"},
//                new String[] {"_", "_", "_"},
//                new String[] {"_", "_", "_"}
//        });
//        Game game = new Game(board, player1, new Player("O"));
//
//        board = game.playerTurn(new int[] {0, 0}, player1, board);
//
//        assertThat(board.getState()[0][0], is("O"));
//    }

    @Test
    public void shouldContinueGameWhenGameIsNotOver() {
        Board board = new Board( new String[][] {
                { "O", "_", "_"},
                { "X", "_", "_"},
                { "X", "_", "_"}
        });
        Game game = new Game(board, new Player("X"), new Player("O"));

        assertFalse(game.isGameOver());
    }

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
