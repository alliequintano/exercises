package TicTacToe;


import java.util.Scanner;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Game {

    public static void main(String[] args) {
        Game game = new Game(new String[][]{
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
            });
        game.play();
    }


    private Board board;
    private String player1 = "X";
    private String player2 = "O";
    private Scanner input = new Scanner(System.in);


    public Game(String[][] board) {
        this.board = new Board(board);
    }

    public void play() {
        while (true) {
            if (!isGameOver()) {
                playerTurn(player1);
                board.printState();
            } else { break; }
            if (!isGameOver()) {
                playerTurn(player2);
                board.printState();
            } else { break; }
        }
    }

    public boolean isGameOver(){
        if (board.isFull() || board.hasThreeInARow() || board.hasThreeInAColumn())
            return true;
        else
            return false;
    }

    public void playerTurn(String player) {
        boolean turnIsOver = false;
        while (!turnIsOver) {
            System.out.println("Enter a position: ");
            int col = input.nextInt();
            int row = input.nextInt();
            if (board.addIfFieldIsOpen(player, col, row))
                turnIsOver = true;
            else
                System.out.println("That field is taken, try again.");
        }
    }
}
