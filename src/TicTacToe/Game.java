package TicTacToe;


/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Game {

    private Board board;
    private Player player1;
    private Player player2;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        do {
            board.printState();
            if (!isGameOver()) {
                board = playerTurn(player1.makeMove(board), player1, board);
            }
            else break;

            board.printState();
            if (!isGameOver())
                board = playerTurn(player2.makeMove(board), player2, board);
            else break;

        } while(true);
    }

    public boolean isGameOver(){
        if (    board.isFull() ||
                board.hasThreeInARow() ||
                board.hasThreeInAColumn() ||
                board.hasThreeInADiagonal())
            return true;
        else
            return false;
    }

    private Board playerTurn(int[] move, Player player, Board board) {
        boolean turnIsOver = false;

        while (!turnIsOver) {
            if (board.fieldIsOpen(move)) {
                board = board.addToBoard(player.symbol, move);
                turnIsOver = true;
            } else {
                System.out.println("Sorry that spots taken. Try again ;)");
                board.printState();
                move = player.makeMove(board);
            }
        }
        return board;
    }
}
