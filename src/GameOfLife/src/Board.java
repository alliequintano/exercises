package GameOfLife.src;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alexandraquintano on 2/27/17.
 */
public class Board {
    private int length;
    private int width;
    private List<Cell> aliveCells;

    public Board() {
        this.length = 5;
        this.width = 5;
        this.aliveCells = Arrays.asList();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public List<Cell> seed() {
        Cell cell = new Cell(Status.ALIVE);
        List<Cell> aliveCells = Arrays.asList(cell);

        return aliveCells;
    }

    public List<Cell> getAliveCells() {
        return aliveCells;
    }
}
