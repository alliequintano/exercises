package TicTacToe;


/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }


    private Board board;
    private Player player1;
    private Player player2;

    public Game() {
        board = Board.getInstance();
        player1 = new Player("X");
        player2 = new Player("O");
    }

    public void play() {
        while (isGameOver()) {
            player1.takeTurn();
            board.printState();
            player2.takeTurn();
            board.printState();
        }
    }

    public boolean isGameOver(){
        if (Board.isFull())
            return true;
        else
            return false;
    }

}
