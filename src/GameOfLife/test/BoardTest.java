package GameOfLife.test;

import GameOfLife.src.Board;
import GameOfLife.src.Cell;
import GameOfLife.src.Status;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexandraquintano on 2/27/17.
 */
public class BoardTest {

    @Test
    public void shouldInitializeGrid() {
        Board board = new Board();

        assertThat(board.getLength(), is(5));
        assertThat(board.getWidth(), is(5));
        assertThat(board.getAliveCells().size(), is(0));
    }

    @Test
    public void shouldSeedGameWithOneAliveCell() {
        Board board = new Board();
        board.seed();

        assertThat(board.getAliveCells().get(0).getStatus(), is(Status.ALIVE));
    }

    @Test
    public void shouldRandomlyAssignPositionToCell() {
        Board board = new Board();

        List<Cell> aliveCells = board.seed();

        assertThat(aliveCells.get(0).getPosition(), notNullValue());
    }

}
