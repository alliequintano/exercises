package TicTacToe;

/**
 * Created by alexandraquintano on 2/26/17.
 */
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("X");
        Player player2 = new Player("O");
        Board board = new Board(new String[][]{
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        });
        Game game = new Game(board, player1, player2);
        game.play();
    }
}
