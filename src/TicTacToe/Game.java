package TicTacToe;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }


    Board board;
    Player player1;
    Player player2;


    Game() {
        board = new Board();
        player1 = new Player("X");
        player2 = new Player("O");
    }

    public void play() {

    }


}