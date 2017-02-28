package GameOfLife.src;

/**
 * Created by alexandraquintano on 2/27/17.
 */
public class Cell {
    private Status status;
    private String position;

    public Cell(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getPosition() {
        return null;
    }
}
