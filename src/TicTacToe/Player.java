package TicTacToe;

import java.util.Scanner;

/**
 * Created by alexandraquintano on 2/23/17.
 */
public class Player {
    public String symbol;
    private Scanner input = new Scanner(System.in);


    public Player(String symbol) {
        this.symbol = symbol;
    }

    public int[] makeMove(Board board) {
        int[] coordinates = new int[2];
        System.out.println("Enter a position: ");
        coordinates[0] = input.nextInt();
        coordinates[1] = input.nextInt();
        return coordinates;
            //System.out.println("That field is taken, try again.");
    }

}
