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
        int[] move;
        boolean turnIsOver = false;

        do {
            if (!isGameOver()) {
                while (!turnIsOver) {
                    move = player1.takeTurn(board);
                    if (!board.fieldIsOpen(move)) {
                        board = board.addToBoard(player1.symbol, move);
                        turnIsOver = true;
                    }
                    board.printState();
                }
                turnIsOver = false;
            } else break;
        } while(true);
    }
//            if (!isGameOver()) {
//                while (!turnIsOver) {
//                    move = player1.takeTurn(board);
//                    if (!board.fieldIsOpen(move)) {
//                        board = board.addToBoard(player1.symbol, move);
//                        turnIsOver = true;
//                    }
//                    board.printState();
//                }
//                    turnIsOver = false;
//            } else {
//                break;
//            }

    public boolean isGameOver(){
        if (    board.isFull() ||
                board.hasThreeInARow() ||
                board.hasThreeInAColumn() ||
                board.hasThreeInADiagonal())
            return true;
        else
            return false;
    }
//
//    public Board playerTurn(Player player) {
//
//        boolean turnIsOver = false;
//        while (!turnIsOver) {
//            move = player.takeTurn(board);
//            board.canAddSymbolToBoard(move)
//        }
//    }
}
